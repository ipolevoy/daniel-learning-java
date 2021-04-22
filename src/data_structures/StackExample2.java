package data_structures;

import java.util.Stack;

public class StackExample2 {

    public static void main(String[] args) {

        Stack<String> doNames = new Stack<>();
        Stack<String> undoNames = new Stack<>();
        doNames.push("Igor");
        doNames.push("Daniel");

        //setup complete

        //reordering names:
        undoNames.push(doNames.pop());
        undoNames.push(doNames.pop());

        System.out.println(undoNames.pop()); // Igor
        System.out.println(undoNames.pop()); // Daniel
    }

}
