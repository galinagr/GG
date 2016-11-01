package module10.HW10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Task 10.5
 */
public class TenFive {
    public static void main(String[] args) throws Exception {
        exampleWithThreeExceptions(null);

    }

    public static void exampleWithThreeExceptions(String message) {
        try {
            String a = null;
            if (!a.equals(message))
                a = message;
            else a = message + message;
            Map map = new HashMap<>();
            map.put(1, message);
            map.put(2, a);

            System.out.println("Map is : " + map.get(-9));
        } catch (NullPointerException e) {
            System.out.println("null pointer" + e);
            try {
                List<String> list1 = new ArrayList<>();
                list1.add(-6, message);
                list1.add(2, message + message);
                if (!(list1.get(1).equals(list1.get(-90).toString())))
                    System.out.println("Mistake!!!" + list1.get(3) + "<<<" + list1.get(20) + "<<<" + list1.get(1));
            } catch (IndexOutOfBoundsException e1) {
                System.out.println("Second mistake!!!" + e1);
                try {
                    List list = new ArrayList<String>();
                    list.add("aaa");
                    list.add("bbb");
                    list.remove(0);
                    list.add(1);
                    int count = (list.size() / 0);
                    System.out.println("Count " + count);
                } catch (Exception e2) {
                    System.out.println("Out of Bound: list elements do not exist!!!" + e2);
                }
            }
        } finally {
            System.out.println("End of method!!!");
        }


    }
}