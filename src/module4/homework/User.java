package module4.homework;

public class User {
    private double balance;
    private long id;
    private String name;
    private int monthsOfEmployment;
    private int salary;
    private String company;
    private Bank bank;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "balance=" + balance +
                ", bank=" + bank +
                '}';
    }
}
//package Module4.homework;
//
