package designPatterns.behavioralPatterns.chainOfResponsibility.handlers;

import designPatterns.behavioralPatterns.chainOfResponsibility.SupportHandler;

public class Level1SupportHandler implements SupportHandler {
    SupportHandler nextHandler;
    @Override
    public void handleRequest(String request) {
        if (request.equals("Can't connect to the internet")) {
            System.out.println("Level 1 Support: Restart your modem.");
        } else {
            System.out.println("Level 1 Support: Unable to handle the request. Passing to Level 2.");
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public SupportHandler setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
