package data_structures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MyArray {

    public static void main(String[] args) throws IOException {

        StreachableArray people = new StreachableArray();

        List peopleList = Files.readAllLines(Paths.get("./src/data_structures/people.txt"));


        for(int i = 0; i < peopleList.size(); i++){
            String line = peopleList.get(i).toString();
            String fn = line.substring(0, line.indexOf(' '));
            String ln = line.substring(line.indexOf(' '));

            people.add(new Person(fn, ln));
        }


        for(int x = 0; x < people.size(); x++){
            Person p = (Person) people.get(x); // casting an object into a Person
            System.out.println(p);
        }
    }
}
