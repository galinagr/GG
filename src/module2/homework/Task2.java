package module2.homework;

public class Task2 {

    public static void main(String[] args) {
        int[] balances = {1000, 200, 400};
        for (int i = 0; i < balances.length - 1; i++) {
            balancesSum(balances);
        }
    }

    /**
     * This method is calculating rest amount and print out the possible withdrawal
     *
     */
    static void balancesSum(int[] balances) {
        double withdrawal = 191;
        for (int i = 0; i < balances.length; i++) {
            double rest = balances[i] - withdrawal - balances[i] * 0.05;
            if (rest >= 0) {
                System.out.println("Balance = " + rest + "Withdrawal = " + withdrawal);
                System.out.println("Output is OK!!!");
            } else {
                System.out.println("Balance = " + rest + "Withdrawal = " + withdrawal);
                System.out.println("Output is IMPOSSIBLE!!!");
            }
        }
    }
}


