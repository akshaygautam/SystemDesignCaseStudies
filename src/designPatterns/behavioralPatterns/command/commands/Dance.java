package designPatterns.behavioralPatterns.command.commands;

import designPatterns.behavioralPatterns.command.Command;

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
