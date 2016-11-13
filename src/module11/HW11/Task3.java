package module11.HW11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Task3 {

    public static void main(String[] args) throws IOException {
        String path = "C://Workspace/GG/src/module11/HW11/File.txt";
        createFile(path, true);
        Map<String, String> newMap = new HashMap<>();
        writeToFile(path, contentFile(newMap));
        replValues(newMap, path);
    }

    public static Map contentFile(Map<String, String> map) {
        map.put("One", "222");
        map.put("Two", "John");
        map.put("Three", "111");
        return map;
    }

    public static void writeToFile(String path, Map map) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Object o : map.entrySet()) {
                Entry thisEntry = (Entry) o;
                Object key = thisEntry.getKey();
                Object value = thisEntry.getValue();
                System.out.println(key);
                System.out.println(value);

                sb.append(key);
                sb.append("   ");
                sb.append(value);
                sb.append("   ");
                bw.append(sb.toString());
                bw.append(System.lineSeparator());
            }
            System.out.println("File content: " + sb);

        } catch (IOException e) {
            System.out.println("write failed!!!");
        }
    }

    public static void replValues(Map<String, String> map, String path) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        try {

            for (Object o : map.entrySet()) {
                Entry thisEntry = (Entry) o;
                Object key = thisEntry.getKey();
/**
 * If we need to append new data to a file we should use
 * map.put("Other key", newValue)
 */
                if (key.equals("One")) {
                    String value = "Replacement";
                    map.put("One", value);
                    System.out.println(key);
                    System.out.println(value);
                    writeToFile(path, map);
                }
            }
            System.out.println("File conetnt: " + map);

        } catch (IOException e) {
            System.out.println("write failed!!!");
        } finally {
            bw.close();
        }
    }

    public static void createFile(String path, boolean flag) throws IOException {

        File myFile = new File(path);
        FileOutputStream fooStream = null;
        try {
            fooStream = new FileOutputStream(myFile, flag);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
