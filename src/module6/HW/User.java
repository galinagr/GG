package module6.HW;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private int salary;
    private int balances;

    public User(long id, String firstName, String lastName, int salary, int balances) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balances = balances;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalances() {
        return balances;
    }

    public void setBalances(int balances) {
        this.balances = balances;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;


        if (id != 0) {
            if (id != user.id) return false;
        }

        if (firstName != null) {
            if (!firstName.equals(user.firstName)) return false;
        }

        if (lastName != null) {
            if (!lastName.equals(user.lastName)) return false;
        }

        if (salary != 0) {
            if (salary != user.salary) return false;
        }

        if (balances != 0) {
            if (balances != user.balances) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + balances;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", balances=" + balances +
                '}';
    }
}
