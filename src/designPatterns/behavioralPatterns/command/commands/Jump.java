package designPatterns.behavioralPatterns.command.commands;

import designPatterns.behavioralPatterns.command.Command;

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
