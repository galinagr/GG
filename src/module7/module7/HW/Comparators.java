package module7.module7.HW;

import java.util.Comparator;

class Comparators {
    static int i;
    Comparator<Order> priceDecreased = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o2.getPrice() - o1.getPrice();
        }
    };
    Comparator<Order> priceIncreased = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };

    Comparator<Order> itemName = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o1.getItemName().compareTo(o2.getItemName());
        }
    };

    Comparator<Order> shopID = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        }
    };

    Comparator<Order> uniqueCities = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            int rezult = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return rezult;
        }
    };
    Comparator<Integer> treesetOrders = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("Price:  " + o1.compareTo(o2));
            i = o1.compareTo(o2);
            if (i == -1) System.out.println("Resulted max price: " + o2 );
            return i;

        }
    };


}