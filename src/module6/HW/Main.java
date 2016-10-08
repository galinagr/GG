package module6.HW;

import java.util.Arrays;

public class Main {
    private static User[] users = new User[4];



    public static void main(String[] args) {
        UserUtil userUtil = new UserUtil();
        User user0 = new User(12123, "Nick", "Pavlov", 2000, 40000);
        users[0] = user0;
        User user1 = new User(12124, "Alex", "Ivanov", 2300, 40000);
        users[1] = user1;
        User user2 = new User(12123, "Nick", "Pavlov", 2000, 40000);
        users[2] = user2;
        User user3 = new User(0, "null", "null", 0, 0);
        users[3] = user3;
        userUtil.deleteEmptyUsers(users);
        System.out.println("Result of deleteEmptyUsers method is:" + Arrays.toString(users));
        System.out.println("Before methods USERS is:" + Arrays.toString(users));
        UserUtil.getUsersId(users);
        System.out.println("IDs are:" + Arrays.toString(UserUtil.b));
        userUtil.uniqueUsers(users);
        System.out.println("Unique users are:" + Arrays.toString(users));
        userUtil.paySalaryToUsers(users);
        System.out.println("Salary:" + Arrays.toString(users));
        User[] users = userUtil.usersWithContitionalBalance(Main.users, 4000);
        System.out.println("Balance:" + Arrays.toString(users));

    }
}