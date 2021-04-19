package data_structures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RealShortList {

    public static void main(String[] args) throws IOException {
        Files.readAllLines(Paths.get("./src/data_structures/people.txt")).forEach(System.out::println);
    }
}
