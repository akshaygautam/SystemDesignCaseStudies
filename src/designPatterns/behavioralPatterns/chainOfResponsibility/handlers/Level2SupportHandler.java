package designPatterns.behavioralPatterns.chainOfResponsibility.handlers;

import designPatterns.behavioralPatterns.chainOfResponsibility.SupportHandler;

public class Level2SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void handleRequest(String request) {
        if (request.equals("Can't connect to the internet")) {
            System.out.println("Level 2 Support: Check your router configuration.");
        } else {
            System.out.println("Level 2 Support: Unable to handle the request. Passing to Level 3.");
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public SupportHandler setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
