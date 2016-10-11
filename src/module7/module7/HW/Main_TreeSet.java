package module7.module7.HW;

import java.util.*;

import static module7.module7.HW.Comparators.i;
import static module7.module7.HW.Currency.UAH;
import static module7.module7.HW.Currency.USD;

public class Main_TreeSet {


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(121, "Nick", "Pavlov", "Kyiv", 20000));
        users.add(new User(122, "Phil", "Svetlov", "Kyiv", 29000));
        users.add(new User(123, "Nill", "Druz", "Donetsk", 26000));
        users.add(new User(124, "Jack", "Antonov", "Kyiv", 12000));
        users.add(new User(125, "Phil", "Nikolson", "Odessa", 27000));
        users.add(new User(126, "Oleg", "Radunov", "Dnepr", 22000));
        users.add(new User(127, "Masha", "Vidova", "Lviv", 22600));
        users.add(new User(128, "Rita", "Raslova", "Zhitomir", 21600));
        users.add(new User(129, "Olga", "Gibidova", "Chernigov", 112000));
        users.add(new User(130, "Natasha", "Rus", "Vinnitsa", 22100));

        Set<Order> orders = new TreeSet<Order>(new Comparators().uniqueCities);
        orders.add(new Order(111, 10, UAH, "Note7", "Shop1", new User(121, "Nick", "Petrov", "Kyiv", 20000)));
        orders.add(new Order(111, 10, UAH, "Note7", "Shop1", new User(121, "Nick", "Petrov", "Kyiv", 20000)));
        orders.add(new Order(113, 15, UAH, "Note3", "Shop1", new User(123, "Nill", "Druz", "Donetsk", 26000)));
        orders.add(new Order(113, 15, UAH, "Note3", "Shop1", new User(123, "Nill", "Druz", "Donetsk", 26000)));
        orders.add(new Order(115, 16, USD, "Note1", "Shop1", new User(125, "Phil", "Nikolson", "Odessa", 27000)));
        orders.add(new Order(116, 12, UAH, "Note1", "Shop3", new User(126, "Oleg", "Radunov", "Dnepr", 22000)));
        orders.add(new Order(117, 50, USD, "Note1", "Shop1", new User(127, "Masha", "Vidova", "Lviv", 22600)));
        orders.add(new Order(115, 188886, USD, "Note1", "Shop1", new User(128, "Rita", "Raslova", "Zhitomir", 21600)));
        orders.add(new Order(119, 30, USD, "Note2", "Shop1", new User(129, "Olga", "Gibidova", "Chernigov", 112000)));
        orders.add(new Order(115, 16, USD, "Note1", "Shop1", new User(130, "Natasha", "Rus", "Vinnitsa", 22100)));

        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {

            String surname = iterator.next().getUser().getLastName();
            System.out.println("Result:   " + surname + "  " + surname.contains("Petrov"));

        }

        Iterator<Order> iterator1 = orders.iterator();
        while (iterator1.hasNext()) {
            new Comparators().treesetOrders.compare(iterator1.next().getPrice(), iterator1.next().getPrice());
            if (i == -1)
                System.out.println("Largest Price order: " + iterator1.toString());
        }

        Iterator<Order> iterator2 = orders.iterator();
        int count = 0;
        while (iterator2.hasNext()) {
            if (iterator2.next().getCurrency() == USD) {
                count++;
                iterator2.remove();
                System.out.println("qauntity to remove is   " + count);
            }
        }
        System.out.println(orders.toString());
    }

}