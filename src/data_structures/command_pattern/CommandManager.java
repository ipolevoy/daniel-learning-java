package data_structures.command_pattern;

import java.util.Stack;

public class CommandManager {

    private final Stack<Command> doItStack = new Stack<>();
    private final Stack<Command> undoItStack = new Stack<>();

    public void execute(Command command){
        command.doIt();
        doItStack.push(command);
    }

    public void doIt(){
        Command command = undoItStack.pop();
        command.doIt();
        doItStack.push(command);
    }

    public void undoIt(){
        Command command = doItStack.pop();
        command.undoIt();
        undoItStack.push(command);
    }
}
