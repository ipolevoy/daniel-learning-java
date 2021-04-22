package data_structures.command_pattern;

public class TypeCommand implements Command{

    private String text;

    public TypeCommand(String text) {
        this.text = text;
    }

    @Override
    public void doIt() {
        System.out.print(text);
    }

    @Override
    public void undoIt() {
        for(int i = 0 ; i < text.length(); i++){

            try {
                Thread.sleep(100);
            } catch (InterruptedException ignore) {}

            System.out.print("\b");
        }
    }
}
