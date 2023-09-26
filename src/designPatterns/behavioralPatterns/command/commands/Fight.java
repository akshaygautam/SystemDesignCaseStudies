package designPatterns.behavioralPatterns.command.commands;

import designPatterns.behavioralPatterns.command.Command;

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
