package sl4j.Exercise_1_Logging_Error_Messages_and_Warning_Levels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.trace("This is a TRACE message");
        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");

        String user = "Sachin";
        int marks = 85;

        logger.info("Student {} scored {} marks", user, marks);
        logger.warn("Low attendance warning for student {}", user);
        logger.error("Unable to save record for student {}", user);
    }
}