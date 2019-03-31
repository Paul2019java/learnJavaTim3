package fundamentalsCoding.employees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.sort;

public class ReadEmployees {

    public static List<String> getAllLines(Path filePath) throws IOException {
        System.out.println("Read lines from " + filePath);

        List<String> lines = Files.readAllLines(filePath);

        return lines;

        //return Files.readAllLines(Path.of(filePath));
    }

    public static void printList(List<String> list){
        for(String item : list){
            System.out.println(item);
        }
    }


}
