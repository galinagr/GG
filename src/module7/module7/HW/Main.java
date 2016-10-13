package module7.module7.HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main {

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

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(111, 10, Currency.UAH, "Note7", "Shop1", users.get(0)));
        orders.add(new Order(112, 20, Currency.USD, "Note1", "Shop2", users.get(1)));
        orders.add(new Order(113, 15, Currency.UAH, "Note3", "Shop1", users.get(2)));
        orders.add(new Order(114, 38888, Currency.UAH, "Note2", "Shop2", users.get(3)));
        orders.add(new Order(115, 16, Currency.USD, "Note1", "Shop1", users.get(4)));
        orders.add(new Order(116, 12, Currency.UAH, "Note1", "Shop3", users.get(5)));
        orders.add(new Order(117, 50, Currency.USD, "Note1", "Shop1", users.get(6)));
        orders.add(new Order(115, 188886, Currency.USD, "Note1", "Shop1", users.get(7)));
        orders.add(new Order(119, 30, Currency.USD, "Note2", "Shop1", users.get(8)));
        orders.add(new Order(115, 16, Currency.USD, "Note1", "Shop1", users.get(9)));


        System.out.println("new array:" + orders);

        List<Order> middleDataList = new ArrayList<>();
        middleDataList.addAll(orders);
        middleDataList.sort(new Comparators().priceDecreased);
        System.out.println("New array sorted by price decreased:" + orders);

        List<Order> middleDataListTwo = new ArrayList<>();
        middleDataListTwo.addAll(orders);
        middleDataListTwo.sort(new Comparators().priceIncreased);
        System.out.println("New array sorted by price increased:" + middleDataListTwo);

        middleDataListTwo.sort(Order::compareTo);
        System.out.println("New array sorted by User city:" + middleDataListTwo);

        List<Order> middleDataListThree = new ArrayList<>();
        middleDataListThree.addAll(orders);
        middleDataListThree.sort(new Comparators().itemName);
        System.out.println("Sorted by itemName:" + middleDataListThree);
        middleDataListThree.sort(new Comparators().shopID);
        System.out.println("Sorted by shopID:" + middleDataListThree);
        middleDataListThree.sort(Order::compareTo);
        System.out.println("Sorted by user's ID:" + middleDataListThree);
       /*
       * Removing the dublicates
       *
       */
        List<Order> middleDataListFour = new ArrayList<>();
        middleDataListFour.addAll(orders);

        Iterator<Order> iterator1 = middleDataListFour.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(iterator1)) iterator1.remove();
            System.out.println("New List is " + middleDataListFour);
        }
        List<Order> middleDataListFive = new ArrayList<>();
        middleDataListFive.addAll(orders);
        Iterator<Order> iterator2 = middleDataListFive.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().getPrice() < 1500) iterator2.remove();
            System.out.println("New List with updated price is " + middleDataListFive);
        }
        List<Order> middleDataListSix = new ArrayList<>();
        List<Order> middleDataListSeven = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getCurrency().equals(Currency.USD))
                middleDataListSix.addAll(orders.subList(i, i + 1));
            middleDataListSeven.addAll(orders.subList(i, i + 1));
        }
        System.out.println("With USD:" + middleDataListSix.toString());
        System.out.println("With EURO:" + middleDataListSeven.toString());

        List<Order> middleDataListEight = new ArrayList<>();
        List<Order> middleDataListNine = new ArrayList<>();
        middleDataListEight.addAll(orders);
        for (int j = 0; j < middleDataListEight.size(); j++) {

            java.lang.String city = middleDataListEight.get(j).getUser().getCity();
            middleDataListNine.addAll(middleDataListEight.subList(j, j + 1));
            for (int i = j + 1; i < middleDataListEight.size(); i++) {

                if (city.equals(middleDataListEight.get(i).getUser().getCity())) {
                    middleDataListNine.addAll(middleDataListEight.subList(i, i + 1));
                    middleDataListEight.remove(i);
                    for (int k = 0; k < middleDataListEight.size(); k++) {
                        System.out.println(middleDataListEight.get(k).getUser().getCity());
                    }
                }
            }
            System.out.print(city + "  is displayed in the following orders:");
            System.out.println(middleDataListNine.toString());
            middleDataListNine.clear();

        }
/**
 * the task 7.5
 */
        List<Integer> ordersIntLinkedList = new LinkedList<>();
        List<Integer> ordersIntList = new ArrayList<>();
        List<String> ordersStrLinkedList = new LinkedList<>();
        List<String> ordersStrList = new ArrayList<>();

        System.out.println("LinkedList Integer");
        Time_methods.timeCalculation_List_Int(1000, ordersIntLinkedList);
        Time_methods.timeCalculation_List_Int(10000, ordersIntLinkedList);

        System.out.println("List Integer");
        Time_methods.timeCalculation_List_Int(1000, ordersIntList);
        Time_methods.timeCalculation_List_Int(10000, ordersIntList);

        System.out.println("LinkedList String");
        Time_methods.timeCalculation_List_String(1000, ordersStrLinkedList);
        Time_methods.timeCalculation_List_String(10000, ordersStrLinkedList);

        System.out.println("List String");
        Time_methods.timeCalculation_List_String(1000, ordersStrList);
        Time_methods.timeCalculation_List_String(10000, ordersStrList);
    }
}


