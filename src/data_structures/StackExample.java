package data_structures;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> names = new Stack<>();

        names.push("Igor");
        names.push("Daniel");

        System.out.println(names.size());// prints 2
        System.out.println(names.pop());// prints Daniel
        System.out.println(names.size());// prints 1
        System.out.println(names.pop()); // prints Igor
        System.out.println(names.size()); // prints 0

    }
}
