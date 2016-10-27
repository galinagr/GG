package module10.HW10;

public class Main {
    public static void main(String[] args) {
        String argumentOne = "One";
        String argumentTwo = "TwoTwo";
        try {
            if (argumentOne.compareTo(argumentTwo) > 0)
                System.out.println(argumentOne + "One");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("I am here");
        }
    }

}
