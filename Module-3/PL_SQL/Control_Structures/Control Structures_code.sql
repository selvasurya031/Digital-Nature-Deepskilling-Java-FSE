-- 1 Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, 
--   apply a 1% discount to their current loan interest rates.

create or REPLACE procedure Apply_Senior_Discount
IS
    old_interest NUMBER;
BEGIN
    FOR rec IN (SELECT * FROM customers)
    LOOP
        IF TRUNC(MONTHS_BETWEEN(SYSDATE, rec.dob) / 12) > 60 THEN

            select interestrate into old_interest FROM loans where customerid = rec.customerid;

            UPDATE loans SET interestrate = interestrate - 1 WHERE customerid = rec.customerid;

            DBMS_OUTPUT.PUT_LINE(
                'Customer ID: ' || rec.customerid || ' | Old Rate: ' || old_interest ||
                '% | New Rate: ' || (old_interest - 1) || '%'
            );

        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Loan interest rate update completed.');
END ;
/


-- 2. Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for 
--    those with a balance over $10,000.


create or replace procedure vip
IS
cursor checkbalance is select customerid,balance from customers;
customer_id customers.CUSTOMERID%TYPE;
customer_balance customers.balance%type;
BEGIN
    open checkbalance;
    LOOP
        fetch checkbalance into customer_id,customer_balance;
        exit when checkbalance%notfound;
        if customer_balance > 10000 then

        update customers set IsVip ='Y' where customerid=customer_id;
                    DBMS_OUTPUT.PUT_LINE(
                'Customer ' || customer_id ||
                ' -> VIP'
            );
        end if;
        end LOOP;
        close checkbalance;
        end ;
/
-- 3 . Write a PL/SQL block that fetches all loans due in the next 30 days and prints 
-- a reminder message for each customer.


create or replace PROCEDURE loanadue
IS
cursor checkdate is select * from loans where enddate BETWEEN sysdate and sysdate + 30;
filtered_list loans%rowtype;
cus_name customers.NAME%TYPE;
BEGIN
    open checkdate;
    loop
    fetch checkdate into filtered_list;
    exit when checkdate%notfound;
    select name into cus_name from customers where CUSTOMERID = filtered_list.customerid;
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || cus_name ||
            ', your loan amount of ' || filtered_list.loanamount ||
            ' is due in ' ||
            ROUND(filtered_list.enddate - SYSDATE) ||
            ' days.'
        );
    end loop;
    close checkdate;
    end;
/

execute Apply_Senior_Discount;
execute vip;
execute LOANADUE;      


show error;