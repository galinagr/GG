package module4.homework;


class BankSystemImpl implements BankSystem {

    private int a;

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount) / 100; //5 -> 0.05
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission) {
            //do logic if rules allow
            double newBalance = user.getBalance() - amount - amount * commission;
            user.setBalance(newBalance);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();

        int commission = userBank.getCommission(amount) * 2;
        if (userBank.getLimitOfFunding() >= commission + amount) {
            user.setBalance(user.getBalance() - amount);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double deltaAmount = fromUser.getBalance() - amount - fromUser.getBank().getCommission(amount);
        double newUserBalance = toUser.getBalance() + deltaAmount;
        toUser.setBalance(newUserBalance);
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void paySalary(User user, int amount) {
        user.setBalance((user.getBalance() + user.getSalary()) - user.getBank().getCommission(amount));
    }

    int calculate() {
        return a++;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //

        fundUser(null, 10);

        BankSystemImpl bankSystem = (BankSystemImpl) obj;
        return this.calculate() == bankSystem.calculate();

        //return super.equals(obj);
    }
}