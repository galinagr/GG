package module4.homework;

abstract class Bank {
    private long id;
    private String bankCurrency;
    private int numberOfEmployeers;
    private double avrSalaryOfEmployee;
    private Currency currency;
    private long totalCapital;
    private long rating;

    Bank(long id, String bankCurrency, int numberOfEmployeers, double avrSalaryOfEmployee, Currency currency, long totalCapital, long rating) {
        this.id = id;
        this.bankCurrency = bankCurrency;
        this.numberOfEmployeers = numberOfEmployeers;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.currency = currency;
        this.totalCapital = totalCapital;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public String getBankCurrency() {
        return bankCurrency;
    }

    private int getNumberOfEmployeers() {
        return numberOfEmployeers;
    }

    private double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public long getRating() {
        return rating;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBankCurrency(String bankCurrency) {
        this.bankCurrency = bankCurrency;
    }

    public void setNumberOfEmployeers(int numberOfEmployeers) {
        this.numberOfEmployeers = numberOfEmployeers;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    void setCurrency(Currency currency) {
        this.currency = currency;
    }

    Currency getCurrency() {
        return currency;
    }

    abstract int getCommission(int summ);

    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    double moneyPaidMonthlyForSalary() {
        return getNumberOfEmployeers() * getAvrSalaryOfEmployee() * getMonthlyRate();
    }


    @Override
    public String toString() {
        return "Bank{" +
                "currency=" + currency +
                '}';
    }



    /*@Override
    public boolean equals(Object object) {
        if (this == object) return true;
        //if (object == null || getClass() != object.getClass()) return false;
        Bank bank = null;
        if(object instanceof Bank) {
            bank = (Bank) object;
        }

        return id == bank.id;
    }*/

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        //if (object == null || getClass() != object.getClass()) return false;

        Bank bank = (Bank) object;

        if (id != bank.id) return false;
        if (totalCapital != bank.totalCapital) return false;
        if (Double.compare(bank.rating, rating) != 0) return false;
        //  if (currency != bank.currency) return false;
        //  return name != null ? name.equals(bank.name) : bank.name == null;
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}

