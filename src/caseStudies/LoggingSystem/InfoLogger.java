package caseStudies.LoggingSystem;

import java.util.*;

public class InfoLogger extends Logger{
    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel == INFO) {
            System.out.println(logLevel + " Message: "+message);
        }else {
            super.log(logLevel, message);
        }
    }
}
