package module10.HW10;

import java.util.ArrayList;
import java.util.List;

/**
 * Create your own exception class using the extends keyword.
 * Write a constructor for this class that takes a String argument and stores it
 * inside the object with a String reference. Write a method that prints out the stored String.
 * Create a try-catch clause to exercise your new exception.
 */
public class TaskTenTwo extends Exception {
    public TaskTenTwo(String message) {
        super(message);
        try {
            List<String> object = new ArrayList<String>();
            object.add(message);
            System.out.println("Object = "+ object.get(1));
        } catch (IndexOutOfBoundsException e ) {
            e.printStackTrace();
        }
    }

}
