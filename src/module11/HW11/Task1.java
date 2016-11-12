package module11.HW11;

import org.apache.commons.lang3.StringUtils;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String pathFile = "C://Workspace/GG/src/module11/HW11/FileForReading.txt";
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile, true));
        StringBuilder sb = new StringBuilder();
        try {
            String var = bufferedReader.readLine();
            while (var != null) {
                sb.append(var);
                sb.append(System.lineSeparator());
                System.out.println("Old value: " + var);
                var = bufferedReader.readLine();
            }
            String var1 = sb.toString().replace(" ", "!!!");
/**
 * Deleting  the following 2 lines
 *
 * PrintWriter writer = new PrintWriter(pathFile);
   writer.print(StringUtils.EMPTY);

 we could ADD new values below the old values
 */
            PrintWriter writer = new PrintWriter(pathFile);
            writer.print(StringUtils.EMPTY);
            bw.write(var1);
            System.out.println(" New value: " + var1);

        } catch (IOException e) {
            System.out.println("read failed");
        } finally {
            bufferedReader.close();
            bw.close();
        }
    }

}
