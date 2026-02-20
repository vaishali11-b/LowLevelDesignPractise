package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;
public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void processLog(int level, String message) {
        if(level == 3) {
            System.out.println("Error log: " + message);
        } else {
            super.processLog(level, message);
        }
    }

    
}
