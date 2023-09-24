package designPatterns.command.commands;

import designPatterns.command.Command;

import java.util.*;

public class Fight implements Command {
    private final String characterName;

    public Fight(String characterName) {
        this.characterName = characterName;
    }
    @Override
    public void execute() {
        System.out.println(this.characterName + " Start Fighting");
    }

    @Override
    public void undo() {
        System.out.println(this.characterName + " Stop Fighting");
    }
}
