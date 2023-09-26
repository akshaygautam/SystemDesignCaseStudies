package designPatterns.behavioralPatterns.chainOfResponsibility.handlers;

import designPatterns.behavioralPatterns.chainOfResponsibility.SupportHandler;

public class Level3SupportHandler implements SupportHandler {
    @Override
    public void handleRequest(String request) {
        System.out.println("Level 3 Support: Escalating the issue to a senior technician.");
    }

    @Override
    public SupportHandler setNextHandler(SupportHandler nextHandler) {
        return this;
    }
}
