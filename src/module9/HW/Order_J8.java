package module9.HW;

public class Order_J8 {
    private long id;
    private int price;
    private Currency_J8 currencyJ8;
    private String itemName;
    private String shopIdentificator;
    private User_J8 userJ8;

    public Order_J8(long id, int price, Currency_J8 currencyJ8, String itemName, String shopIdentificator, User_J8 userJ8) {
        this.id = id;
        this.price = price;
        this.currencyJ8 = currencyJ8;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.userJ8 = userJ8;
    }

    @Override
    public String toString() {
        final StringBuilder sbOrder = new StringBuilder("Order{");
        sbOrder.append("id=").append(id);
        sbOrder.append(", price=").append(price);
        sbOrder.append(", currency=").append(currencyJ8);
        sbOrder.append(", itemName='").append(itemName).append('\'');
        sbOrder.append(", shopIdentificator='").append(shopIdentificator).append('\'').append(", user=").append(userJ8);
        sbOrder.append('}').toString();
        return sbOrder.toString();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency_J8 getCurrencyJ8() {
        return currencyJ8;
    }

    public void setCurrencyJ8(Currency_J8 currencyJ8) {
        this.currencyJ8 = currencyJ8;
    }

    String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User_J8 getUserJ8() {
        return userJ8;
    }

    public void setUserJ8(User_J8 userJ8) {
        this.userJ8 = userJ8;
    }

    int compareTo(Order_J8 o) {
        return o.getUserJ8().getCity().compareTo(this.userJ8.getCity());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order_J8 orderJ8 = (Order_J8) o;

        if (id != orderJ8.id) return false;
        if (price != orderJ8.price) return false;
        if (currencyJ8 != orderJ8.currencyJ8) return false;
        if (!itemName.equals(orderJ8.itemName)) return false;
        if (!shopIdentificator.equals(orderJ8.shopIdentificator)) return false;
        return userJ8.equals(orderJ8.userJ8);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + currencyJ8.hashCode();
        result = 31 * result + itemName.hashCode();
        result = 31 * result + shopIdentificator.hashCode();
        result = 31 * result + userJ8.hashCode();
        return result;
    }
}