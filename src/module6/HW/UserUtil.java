package module6.HW;

class UserUtil {
    static long b[] = new long[4];


    User[] uniqueUsers(User[] users) {
        int count = 0;
        User[] users1 = new User[4];
        System.arraycopy(users, 0, users1, 0, users.length);
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (!users[i].equals(users1[j])) {
                    count++;
                    System.out.println(users[i] + "is a unique user");
                }
                System.out.println("The array has " + count + "unique users");
            }
        }
        return users;
    }

    User[] usersWithContitionalBalance(User[] users, int balance) {
        int count = 0;
        for (User ausers : users) {
            if (ausers.getBalances() == balance) {
                count++;
                System.out.println("The balance of " + count + " users equals defined balance");
            }
        }
        return users;

    }

    final User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            int newBalance = user.getBalances()+user.getSalary();
            System.out.println("Salary is " + user.getSalary()+ "New balance is" + newBalance);
        }
        return users;
    }

    final static long[] getUsersId(User[] users) {
        for (int i = 0; i < users.length; i++) {
            b[i] = users[i].getId();
            System.out.println("The user with ID" + b[i] + " belongs to the given array");
        }
        return b;
    }

    User[] deleteEmptyUsers(User[] users) {
        int count = 0;
        for (User user : users) {
            if (user.getId() == 0 && user.getFirstName().equals("null") && user.getLastName().equals("null") && user.getSalary() == 0 && user.getBalances() == 0) {
                count++;
                System.out.println("the quantity of empty users is " + count);
            }

        }
        return users;
    }
}
