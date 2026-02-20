package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;
public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void processLog(int level , String message){
        if(level == 1){
            System.out.println("Info log: " + message);
        }else{
            super.processLog(level , message);
        }
        }
}
    
