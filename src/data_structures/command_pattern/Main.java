package data_structures.command_pattern;

public class Main {

    public static void main(String[] args) {
        TypeCommand typeCommand1 = new TypeCommand("Hello");
        TypeCommand typeCommand2 = new TypeCommand(" ");
        TypeCommand typeCommand3 = new TypeCommand("Daniel");
        CommandManager cm = new CommandManager();
        cm.execute(typeCommand1);
        cm.execute(typeCommand2);
        cm.execute(typeCommand3);
        cm.undoIt();
        cm.undoIt();
        cm.undoIt();
        cm.doIt();
        cm.doIt();
        cm.doIt();

    }
}
