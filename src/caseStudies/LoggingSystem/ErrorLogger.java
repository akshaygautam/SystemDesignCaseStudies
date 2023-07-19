package caseStudies.LoggingSystem;

import java.util.*;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel == ERROR) System.out.println(logLevel +" Message: "+message);
        else super.log(logLevel, message);
    }
}
