package module4.homework;


public class USBank extends Bank {

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (summ <= 1000) commission = 5;
            else commission = 7;
        } else {
            if (summ <= 1000) commission = 6;
            else commission = 8;

        }
        return commission;
    }

    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 10000;
        else limit = 0;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD) monthlyRate = 1;
        else monthlyRate = 2;
        return monthlyRate;
    }
}
