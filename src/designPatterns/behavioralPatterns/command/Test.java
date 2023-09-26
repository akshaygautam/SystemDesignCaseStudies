package designPatterns.behavioralPatterns.command;

import designPatterns.behavioralPatterns.command.commands.Dance;
import designPatterns.behavioralPatterns.command.commands.Fight;
import designPatterns.behavioralPatterns.command.commands.Jump;

public class Test {
    public static void main(String[] args) {
        CharacterController controller = new CharacterController();
        Command jumpCommand = new Jump("Bob");
        Command shootCommand = new Dance("Bob");
        Command danceCommand = new Fight("Bob");

        controller.setCommand(jumpCommand);
        controller.execute();

        controller.setCommand(shootCommand);
        controller.execute();

        controller.setCommand(danceCommand);
        controller.execute();

        controller.undoLastCommand();
    }
}
