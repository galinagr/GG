package module2.homework;

public class Task3 {

    public static void main(String[] args) {
        int[] balances = {1000, 200, 400};
        String[] names = {"John", "Sarah", "Peter"};
        for (int i = 0; i < balances.length - 1; i++) {
            balancesSumPlusNames(balances, names);
        }
    }

    /**
     * This method is calculating rest amount and print out the possible withdrawal and the names of owners
     */
    static void balancesSumPlusNames(int[] balances, String[] names) {
        double withdrawal = 191;
        for (int i = 0; i < balances.length; i++) {
            double rest = balances[i] - withdrawal - balances[i] * 0.05;
            if (rest >= 0) {
                System.out.println("Balance of " + names[i] + " = " + rest + " Withdrawal = " + withdrawal);
                System.out.println("Output is OK!!!");
            } else {
                System.out.println("Balance of " + names[i] + " = " + rest + " Withdrawal = " + withdrawal);
                System.out.println("Output is IMPOSSIBLE!!!");
            }
        }
    }
}