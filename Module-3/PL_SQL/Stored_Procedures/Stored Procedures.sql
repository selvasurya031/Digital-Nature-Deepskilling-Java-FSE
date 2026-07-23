Stored Procedures--  1: The bank needs to process monthly interest for all savings accounts.
-- 	Question: Write a stored procedure ProcessMonthlyInterest that calculates and updates the balance of all savings accounts by applying an interest rate of 1% to the current balance.

create or replace PROCEDURE ProcessMonthlyIntrest as
CURSOR interestChecker is SELECT * from customers ;
C_details customers%rowTYPE;
interest number(10,2);
BEGIN
    open interestChecker;
    loop
        fetch interestChecker into c_details;
        exit when interestChecker%notfound;
        interest := c_details.balance* 0.01;
        update customers set balance=balance+interest where customerid =C_details.customerid;
        dbms_output.PUT_LINE('The Monthly balance is updated for '||C_details.name|| ' on ' || sysdate || ' 1% interest = ' ||interest|| ' from ' || c_details.balance ||' to'|| (C_details.balance+interest));

        end loop;
        close interestChecker;
        end ;
        /
        

-- 2: The bank wants to implement a bonus scheme for employees based on their performance.
-- 	Question: Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.


create or replace procedure UpdateEmployeeBonus 
(
    bonus_percentage in number
)
is
cursor e_details is select * from employees;
employee employees%rowTYPE;
bonus number(10,2);
newsalary number(10,2);
BEGIN
    open e_details;
    loop
        fetch e_details into employee;
        exit when e_details%notfound;
        bonus :=employee.salary * (bonus_percentage/100);
        newsalary := employee.salary+bonus;
        update employees set salary = newsalary where employeeid = employee.employeeid;
        dbms_output.put_line(employee.name || ' salary increased by ' || bonus_percentage || '% on ' || employee.salary || 'so salary became ' || newsalary);
        end loop;
        close e_details;
    end;
    /



-- 3: Customers should be able to transfer funds between their accounts.
-- 	Question: Write a stored procedure TransferFunds that transfers a specified amount from one account to another, checking that the source account has sufficient balance before making the transfer.


create or replace procedure TransferFunds 
(A_from in number, a_to in number, amount in number)
as

customer_A customers%rowTYPE;
Customer_B customers%rowTYPE;
newbalance customers.balance%TYPE;
BEGIN
    select * into customer_A from customers where customerid = A_from;
    select * into customer_B from customers where customerid = a_to;
    if customer_A.balance >= amount then 
    update customers set balance = balance-amount where customerid = A_from;
    update customers set balance = balance+amount where customerid = A_to;
    dbms_output.put_line('The amount ' || amount || ' is transfered from ' || customer_A.name || ' to ' || Customer_B.name);
    dbms_output.put_line(customer_A.name || ':' || customer_A.balance || ' to ' || (customer_A.balance-amount));
    dbms_output.put_line(customer_B.name || ':' || customer_B.balance || ' to ' || (customer_B.balance+amount));
    else 
        dbms_output.put_line('Insufficient balance for ' || customer_A.name || customer_A.balance);
    end if;
    
    end;
    /

EXECUTE ProcessMonthlyIntrest;
execute UPDATEEMPLOYEEBONUS(2);    
execute TRANSFERFUNDS(3,2,200);
SHOW ERRORS