package utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {


    public static Path getLocalPath(String... morePaths) {

        return Paths.get(
                System.getProperty("user.dir"),
                morePaths);
    }

    static List<String> fileLinesToList(String... morePaths) throws IOException {

        Path fileFullPath = getLocalPath(morePaths);
        return Files.readAllLines(fileFullPath);
    }
}
