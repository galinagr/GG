package module9.HW;
//TODO: - sort list by Order price in decrease order
//TODO:         - sort list by Order price in increase order AND User city
//TODO:         - sort list by Order itemName AND ShopIdentificator AND User city

//TODO:         - separate list for as many lists as many unique cities are in User

//TODO:                - check if set contain Order where User’s lastName is - “Petrov”
//TODO:                - delete orders where currency is USD

//TODO:        Restrictions:
//TODO:        - you can’t use iterator
//TODO:        - you can’t use loops

import java.util.*;
import java.util.function.Predicate;

//TODO:         Put every subtask to a separate method. Create Main class and test every method with test data.
public class Main {
    public static void main(String[] args) {


        List<User_J8> users = new ArrayList<>();
        users.add(new User_J8(121, "Nick", "Pavlov", "Kyiv", 20000));
        users.add(new User_J8(122, "Phil", "Svetlov", "Kyiv", 29000));
        users.add(new User_J8(123, "Nill", "Druz", "Donetsk", 26000));
        users.add(new User_J8(124, "Jack", "Antonov", "Kyiv", 12000));
        users.add(new User_J8(125, "Phil", "Nikolson", "Odessa", 27000));
        users.add(new User_J8(126, "Oleg", "Radunov", "Dnepr", 22000));
        users.add(new User_J8(127, "Masha", "Vidova", "Lviv", 22600));
        users.add(new User_J8(128, "Rita", "Raslova", "Zhitomir", 21600));
        users.add(new User_J8(129, "Olga", "Gibidova", "Chernigov", 112000));
        users.add(new User_J8(130, "Natasha", "Rus", "Vinnitsa", 22100));

        List<Order_J8> orders = new ArrayList<>();
        orders.add(new Order_J8(111, 10, Currency_J8.UAH, "Note7", "Shop1", users.get(0)));
        orders.add(new Order_J8(112, 20, Currency_J8.USD, "Note1", "Shop2", users.get(1)));
        orders.add(new Order_J8(113, 15, Currency_J8.UAH, "Note3", "Shop1", users.get(2)));
        orders.add(new Order_J8(114, 38888, Currency_J8.UAH, "Note2", "Shop2", users.get(3)));
        orders.add(new Order_J8(115, 16, Currency_J8.USD, "Note1", "Shop1", users.get(4)));
        orders.add(new Order_J8(116, 12, Currency_J8.UAH, "Note1", "Shop3", users.get(5)));
        orders.add(new Order_J8(117, 50, Currency_J8.USD, "Note1", "Shop1", users.get(6)));
        orders.add(new Order_J8(115, 188886, Currency_J8.USD, "Note1", "Shop1", users.get(7)));
        orders.add(new Order_J8(119, 30, Currency_J8.USD, "Note2", "Shop1", users.get(8)));
        orders.add(new Order_J8(115, 16, Currency_J8.USD, "Note1", "Shop1", users.get(9)));

        System.out.println("First array, sorted by price:" + orders);

        /**
         * By order's price decreased
         */
        orders.stream()
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);
        Collections.sort(orders, (o1, o2) -> o2.getPrice() - o1.getPrice());

        /**
         * By order's price increased and User's city
         */
        orders.stream().sorted(Order_J8::compareTo).sorted((o1, o2) -> o1.getUserJ8().getCity().compareTo(o2.getUserJ8().getCity()));
//        Collections.sort(orders, (o1, o2) -> o1.getPrice() - o2.getPrice());
//        System.out.println("Orders sorted by Price increased are: " + orders.toString());
//        Collections.sort(orders, (o1, o2) -> o1.getUserJ8().getCity().compareTo(o2.getUserJ8().getCity()));
        System.out.println("Orders sorted by Price and then by User's city are: " + orders.toString());

        /**
         * Sorted list by Order itemName AND ShopIdentificator AND User city
         */
        orders.stream().sorted((o1, o2) -> o1.getItemName().compareTo(o2.getItemName())).sorted((o1, o2) -> o1.getShopIdentificator().compareTo(o2.getShopIdentificator())).sorted((o1, o2) -> o1.getUserJ8().getCity().compareTo(o2.getUserJ8().getCity()));
//        Collections.sort(orders, (o1, o2) -> o1.getItemName().compareTo(o2.getItemName()));
//        System.out.println("Sorted by ItemName: " + orders);
//        Collections.sort(orders, (o1, o2) -> o1.getShopIdentificator().compareTo(o2.getShopIdentificator()));
//        System.out.println(("Sorted by Shop Identificator: "+ orders));
//        Collections.sort(orders, (o1, o2) -> o1.getUserJ8().getCity().compareTo(o2.getUserJ8().getCity()));
        System.out.println("Sorted by User's city: " + orders);



        /**
         * Check if set contain Order where User’s lastName is - “Pavlov”
         */
        List<Order_J8> orders1 = orders;
        orders1.stream()
                .filter(isLastNameAsExpected())
                .forEach(System.out::println);
        /**
         * Delete all elements with currency "USD"
         */
        List<Order_J8> orders2 = orders;
        orders2.stream()
                .filter(isCurrencyUSd())
                .forEach(System.out::println);

        /**
         * Separated list for as many lists as many unique cities are in User
         */

        List<Order_J8> orders3 = orders;

        Set<Order_J8> set = new HashSet<>(orders3);
        //Set<Order> set = new TreeSet<>(orders);
        //int count = set.size();

        List<List<Order_J8>> resListGeneral = new ArrayList<>();
        for (Order_J8 order : set) {
            List<Order_J8> resList = new ArrayList<>();
            int count = 0;
            for (Order_J8 listOrder : orders) {
                if (order.getUserJ8().getCity().equals(listOrder.getUserJ8().getCity())) {
                    resList.add(listOrder);
                    count++;
                }
            }
            resListGeneral.add(resList);
            System.out.println("List with city   " + order.getUserJ8().getCity() + "consists of" + count + " items");
        }
        System.out.println("RESULTED LIST:  " + resListGeneral.toString());


    }

    private static Predicate<? super Order_J8> isLastNameAsExpected() {
        return p -> p.getUserJ8().getLastName().equals("Pavlov");
    }

    private static Predicate<? super Order_J8> isCurrencyUSd() {
        return p -> !p.getCurrencyJ8().toString().equalsIgnoreCase("USD");
    }
}
