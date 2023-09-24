package designPatterns.command.commands;

import designPatterns.command.Command;

import java.util.*;

public class Jump implements Command {
    private final String characterName;

    public Jump(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public void execute() {
        System.out.println(this.characterName + " Start Jumping");
    }

    @Override
    public void undo() {
        System.out.println(this.characterName + " Stop Jumping");
    }
}
