package designPatterns.behavioralPatterns.mediator;

import java.util.*;

public class ChatRoom implements ChatMediator{
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(User user, String message) {
        System.out.println(user.getName() + " sends message: " + message);
        for (User u : users) {
            // Don't send the message back to the sender
            if (u != user) {
                u.receive(message);
            }
        }
    }

    public void addUser(User user) {
        users.add(user);
    }
}
