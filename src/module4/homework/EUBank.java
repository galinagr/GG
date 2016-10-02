package module4.homework;


public class EUBank extends Bank {

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
