package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public abstract class LogProcessor {
    private static int INFO = 1;
    private static int DEBUG = 2;
    private static int ERROR = 3;

    protected LogProcessor nextProcessor;
    public LogProcessor(LogProcessor processor) {
        this.nextProcessor = processor;
    }

    public void processLog(int level, String message) {
        if(nextProcessor != null) {
            nextProcessor.processLog(level, message);
        }
        
    }
}
