import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {
    public static void main(String[] args) {
        Path p = Paths.get("fileIo", "people.txt");

        List<String> newNames = Arrays.asList("Justin", "Javier", "Jason", "Laura");
        try {
            Files.write(p, newNames);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(lines);

        for (String name : lines) {
            System.out.println(name + " works at CodeUp");
        }
        List<String> classmateNames = Arrays.asList("Fernando", "Rich", "Deshawn", "Caleb");
        try {
            Files.write(p, classmateNames);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
