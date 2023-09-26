package designPatterns.behavioralPatterns.chainOfResponsibility;

public interface SupportHandler {
    void handleRequest(String request);
    SupportHandler setNextHandler(SupportHandler nextHandler);
}
