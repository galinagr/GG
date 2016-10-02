package module2.homework;

public class Task4 {
    public static void main(String[] args) {
        int[] balances = {1000, 200, 400};
        String[] names = {"John", "Sarah", "Peter"};
        for (int i = 0; i < balances.length - 1; i++) {
            balancesSumPlusNames(balances, names);
        }
    }

    /**
     * This method is calculating rest amount and print out the possible funding and the names of owners
     */
    static void balancesSumPlusNames(int[] balances, String[] names) {
        double funding = 193.96;
        for (int i = 0; i < balances.length; i++) {
            double rest = balances[i] + funding;
            if (rest >= 0) {
                System.out.println("Balance of " + names[i] + " = " + rest + ". Funding = " + funding);
                System.out.println("Output is OK!!!");
            }
        }
    }
}