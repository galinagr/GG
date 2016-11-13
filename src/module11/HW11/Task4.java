package module11.HW11;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static module11.HW11.Task3.*;

/**
 * Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
 * a) read file, save to string var
 * b) calculate how many time the word occurs
 * c) print result
 * int checkWord(String word)
 * <p>
 * Write this task with usual try and try with resources (two versions)
 */
public class Task4 {
    static String path = "C://Workspace/GG/src/module11/HW11/File1.txt";

    public static void main(String[] args) throws IOException {
        createFile(path, true);
        Map<String, String> newMap = new HashMap<>();
        writeToFile(path, contentFile(newMap));
        checkWord(path, "One");

    }

    public static int checkWord(String path, String word) throws IOException {
        int count = 0;
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("File content: " + line);
                if (!line.contains(word)) {
                    System.out.println("NO SUCH WORD in this line!");
                    break;

                } else {
                    count++;
                }
            }
            System.out.println("\"One\" meets " + count + " times");
        } finally

        {
            scanner.close();
        }
        return count;
    }
}
