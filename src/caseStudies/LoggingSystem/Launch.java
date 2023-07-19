package caseStudies.LoggingSystem;

import java.util.*;

public class Launch {
    public static void main(String[] args) {
        Logger logger = new Logger(new InfoLogger(new DebugLogger(new ErrorLogger(null))));
        logger.log(Logger.DEBUG, "Debugging");
        logger.log(Logger.ERROR, "Erroring");
        logger.log(Logger.INFO, "Infoing");
        logger.log("Random", "random");
    }
}
