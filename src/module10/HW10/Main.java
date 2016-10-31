package module10.HW10;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main extends Throwable {
    public static void main(String[] args) {
        String argumentOne = "One";
        String argumentTwo = "TwoTwo";
        String[] a = {argumentOne, argumentTwo};

        try {
            for (int i = 0; i <= a.length; i++) {
                if (a[i].length() < a[i + 1].length())
                    System.out.println(a[i]);
            }

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index out of range");
        } finally {
            System.out.println("I am here");
        }

        try {
            Calendar cal = Calendar.getInstance();
            String month = new SimpleDateFormat("LLL").format(cal.getTime());
            System.out.println(month);
            new TaskTenTwo(month);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
