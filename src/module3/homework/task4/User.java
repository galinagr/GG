package module3.homework.task4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    private int getBalance() {
        return balance;
    }

    private int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    private String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paidSalary() {
        balance += salary;
    }

    public double withdraw(int summ) {
        double result;
        if (summ >= 1000) {
            result = getBalance() - summ - summ * 0.1;
        } else {
            result = getBalance() - summ - summ * 0.05;
        }
        if (result < 0) System.out.println("Enter new sum, result is negative!");
        return result;
    }

    public int companyNameLenght() {
        int charCount = 0;
        char temp;

        for (int i = 0; i < companyName.length(); i++) {
            temp = companyName.charAt(i);

            if (temp != ' ')
                charCount++;
        }
        return charCount;
    }

    public int monthIncreaser(int addMonth) {
        int c = getMonthsOfEmployment();
        c += addMonth;
        return c;
    }
}
