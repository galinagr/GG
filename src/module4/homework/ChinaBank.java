package module4.homework;

class ChinaBank extends Bank {

    ChinaBank(long id, String bankCurrency, int numberOfEmployeers, double avrSalaryOfEmployee, Currency currency, long totalCapital, long rating) {
        super(id, bankCurrency, numberOfEmployeers, avrSalaryOfEmployee, currency, totalCapital, rating);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 100;
        else limit = 150;
        return limit;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) commission = 3;
            else commission = 5;
        } else {
            if (summ <= 1000) commission = 10;
            else commission = 11;
        }
        return commission;
    }

    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 5000;
        else limit = 10000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD) monthlyRate = 1;
        else monthlyRate = 0;
        return monthlyRate;
    }
}