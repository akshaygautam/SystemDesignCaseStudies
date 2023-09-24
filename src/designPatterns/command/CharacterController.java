package designPatterns.command;

import java.util.*;

public class CharacterController {
    private Command command;
    private Stack<Command> commandHistory = new Stack<>();

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand(){
        if(commandHistory.isEmpty()) return;
        commandHistory.pop().undo();
    }
}
