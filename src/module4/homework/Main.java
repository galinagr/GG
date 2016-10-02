package module4.homework;


import static module4.homework.Currency.EUR;
import static module4.homework.Currency.USD;

public class Main {

    public static void main(String[] args) {
        /*//BankSystemImpl -> User -> Bank
        Bank usBank = new USBank();
        usBank.setCurrency(Currency.EUR);
        User user = new User();
        user.setBalance(5000);
        user.setBank(usBank);

       System.out.println(user);

        //top level of abstraction, we run all methods throught it
        BankSystem bankSystem = new BankSystemImpl(); //better
        //BankSystemImpl bankSystem1 = new BankSystemImpl();
        bankSystem.withdrawOfUser(user, 1100);

        System.out.println(user);*/

        Bank bankEU = new EUBank(123, "EUR", 1234214, 1488, EUR, 1222000, 2352362);
        User userEUOne = new User();
        User userEUTwo = new User();
        userEUOne.setBank(bankEU);
        userEUTwo.setBank(bankEU);
        userEUOne.setBalance(100.95);
        userEUTwo.setBalance(1000);
        userEUOne.setSalary(5000);
        userEUTwo.setId(16500);
        userEUOne.setCompanyName(userEUTwo.getCompanyName());
        userEUTwo.setSalary((int) userEUOne.getBalance() / 2);
        System.out.println(userEUOne.getId() + userEUOne.getCompanyName() + userEUOne.getBalance() + userEUOne.getClass());
        System.out.println(userEUTwo.getId() + userEUTwo.getCompanyName() + userEUTwo.getBalance() + userEUTwo.getClass());


        Bank bankUS = new USBank(124, "USD", 1234214, 1488, USD, 1457500, 2457335);
        User userUSTwo = new User();
        User userUSOne = new User();
        bankUS.setCurrency(EUR);
        userUSOne.setBank(bankUS);
        userUSTwo.setBank(bankUS);
        userUSOne.setBalance(100.95);
        userUSTwo.setBalance(1000);
        userUSOne.setSalary(2000);
        userUSOne.setCompanyName(userUSTwo.getCompanyName());
        userUSTwo.setSalary((int) userUSOne.getBalance() * 2);
        System.out.println(userUSOne.getBank() + userUSOne.getCompanyName() + userUSOne.getBalance() + userUSOne.getClass());
        System.out.println(userUSTwo.getBank() + userUSTwo.getCompanyName() + userUSTwo.getBalance() + userUSTwo.getClass());


        Bank bankCn = new ChinaBank(126, "USD", 12254, 1488222, USD, 1450000, 2457335);
        User userCnOne = new User();
        User userCnTwo = new User();
        userCnOne.setBank(bankCn);
        userCnTwo.setBank(bankCn);
        userCnOne.setBalance(100.95);
        userCnTwo.setBalance(1000);
        userCnOne.setSalary(userCnOne.getSalary() + 5000);
        userCnOne.setId(16500);
        userCnOne.setCompanyName(userCnTwo.getCompanyName());
        userCnTwo.setSalary((int) userCnOne.getBalance() / 2);


        System.out.println(userCnOne.getId() + userCnOne.getCompanyName() + userCnOne.getBalance() + userCnOne.getClass());
        System.out.println(userCnTwo.getId() + userCnTwo.getCompanyName() + userCnTwo.getBalance() + userCnTwo.getClass());
        // Currency currency = Currency.USD;
        // Currency currency1 = Currency.EUR;

        // System.out.println(currency.equals(currency1));

        BankSystemImpl bankSystem1 = new BankSystemImpl();
        BankSystemImpl bankSystem2 = new BankSystemImpl();
        //bankSystem1.setA(110);

    }
}