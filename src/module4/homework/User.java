package module4.homework;

public class User {
    private double balance;
    private long id;
    private String name;
    private int monthsOfEmployment;
    private int salary;
    private String companyName;
    private Bank bank;

    Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getCompanyName() {
        return companyName;
    }

    void setCompanyName(String companyName) {
        this.companyName = companyName;
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
