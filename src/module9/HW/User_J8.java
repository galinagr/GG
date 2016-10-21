package module9.HW;

public class User_J8 {
    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private int balance;

    public User_J8(long id, String firstName, String lastName, String city, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User_J8 userJ8 = (User_J8) o;

        if (id != userJ8.id) return false;
        if (balance != userJ8.balance) return false;
        if (!firstName.equals(userJ8.firstName)) return false;
        if (!lastName.equals(userJ8.lastName)) return false;
        return city.equals(userJ8.city);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + balance;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sbUser = new StringBuilder("User{");
        sbUser.append("id=").append(id);
        sbUser.append(", firstName='").append(firstName).append('\'');
        sbUser.append(", lastName='").append(lastName).append('\'');
        sbUser.append(", city='").append(city).append('\'');
        sbUser.append(", balance=").append(balance);
        sbUser.append('}').toString();
        return sbUser.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}