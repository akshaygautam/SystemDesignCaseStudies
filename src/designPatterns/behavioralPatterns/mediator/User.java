package designPatterns.behavioralPatterns.mediator;

public abstract class User {
    private ChatMediator mediator;
    private String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        mediator.sendMessage(this, message);
    }

    public abstract void receive(String message);
}
