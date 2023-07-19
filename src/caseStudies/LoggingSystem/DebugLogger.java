package caseStudies.LoggingSystem;

import java.util.*;

public class DebugLogger extends Logger{
    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(String logLevel, String message) {
        if(logLevel == DEBUG) System.out.println(logLevel + " Message: "+message);
        else super.log(logLevel, message);
    }
}
