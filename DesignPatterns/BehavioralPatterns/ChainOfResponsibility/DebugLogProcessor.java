package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;
public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    
    public void processLog(int level , String message){
        if (level == 2) {
            System.out.println("Debug log: " + message);
        } else {
            super.processLog(level, message);
            
        }
    }
}
