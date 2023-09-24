package designPatterns.command;

import designPatterns.command.CharacterController;
import designPatterns.command.commands.Dance;
import designPatterns.command.commands.Fight;
import designPatterns.command.commands.Jump;

import java.util.*;

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
