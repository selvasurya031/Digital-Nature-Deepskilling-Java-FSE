package sl4j.Exercise_1_Logging_Error_Messages_and_Warning_Levels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LoggingExample {

    private static final Logger Mylogger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        String userName = "Sachin";
        int userAge = 21;
        double accountBalance = 12500.75;

        Mylogger.info("User name is: {}", userName);
        Mylogger.info("Userage is; {}", userAge);
        Mylogger.info("Account balance is: {}", accountBalance);

        Mylogger.info("User {} is {} years old and   has balance {}", userName, userAge, accountBalance);

        int $stock = 5;
        Mylogger.warn("Low stock warning: only {} items left", $stock);

        String fileName = "data.txt";
        Mylogger.error("Failed to open file; {}", fileName);
    }
}