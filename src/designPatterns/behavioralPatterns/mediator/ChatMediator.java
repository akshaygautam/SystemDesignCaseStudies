package designPatterns.behavioralPatterns.mediator;

public interface ChatMediator {
    void sendMessage(User user, String message);

    void addUser(User user1);
}
