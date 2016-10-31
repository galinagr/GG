package module10.HW10;

public class Main extends Throwable {
    public static void main(String[] args) {
        String argumentOne = "One";
        String argumentTwo = "TwoTwo";
        String []a = {argumentOne, argumentTwo};

        try {
            for (int i=0; i<=a.length; i++) {
                if (a[i].length()<a[i+1].length())
                    System.out.println(a[i]);
            }

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index out of range");
        } finally {
            System.out.println("I am here");
        }
    }

}
