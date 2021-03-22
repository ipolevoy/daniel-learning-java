package data_structures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RealList {

    public static void main(String[] args) throws IOException {
        int index = 0;
        for (String  line : Files.readAllLines(Paths.get("./src/data_structures/people.txt"))) {
            System.out.println(index++ + " > " + line);
        }
    }
}
