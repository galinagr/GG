package module4.homework;


class EUBank extends Bank {

    EUBank(long id, String bankCurrency, int numberOfEmployeers, double avrSalaryOfEmployee, Currency currency, long totalCapital, long rating) {
        super(id, bankCurrency, numberOfEmployeers, avrSalaryOfEmployee, currency, totalCapital, rating);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 2000;
        else limit = 2200;
        return limit;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) commission = 5;
            else commission = 7;
        } else {
            if (summ <= 1000) commission = 2;
            else commission = 4;
        }
        return commission;
    }

    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 20000;
        else limit = 10000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD) monthlyRate = 0;
        else monthlyRate = 1;
        return monthlyRate;
    }
}