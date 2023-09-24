package designPatterns.command.commands;

import designPatterns.command.Command;

import java.util.*;

public class Dance implements Command {
    private final String characterName;

    public Dance(String characterName) {
        this.characterName = characterName;
    }
    @Override
    public void execute() {
        System.out.println(this.characterName + " Start Dancing");
    }

    @Override
    public void undo() {
        System.out.println(this.characterName + " Stop Dancing");
    }
}
