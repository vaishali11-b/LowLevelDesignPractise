package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;
import DesignPatterns.BehavioralPatterns.ChainOfResponsibility.DebugLogProcessor;
import DesignPatterns.BehavioralPatterns.ChainOfResponsibility.ErrorLogProcessor;
import DesignPatterns.BehavioralPatterns.ChainOfResponsibility.InfoLogProcessor;    
public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessorChain = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessorChain.processLog(1, "This is an info message.");
        logProcessorChain.processLog(2, "This is a debug message.");
        logProcessorChain.processLog(3, "This is an error message.");
    }
}
