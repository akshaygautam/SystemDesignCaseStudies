package caseStudies.LoggingSystem;

public class Logger {
    public static final String INFO = "INFO";
    public static final String ERROR = "ERROR";
    public static final String DEBUG = "DEBUG";
    private Logger nextLogger;
    public Logger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void log(String logLevel, String message){
        if(nextLogger != null){
            this.nextLogger.log(logLevel, message);
        }else {
            System.out.println("NO LOGGER FOUND");
        }
    }
}
