package module8.HW;

import java.util.ArrayList;
import java.util.List;

class UserDAO extends AbstractDAOImpl {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public UserDAO save(List<UserDAO> userDAOs) {
        System.out.println("UserDAOs is saved: " + userDAOs.toString());
        return super.save(userDAOs);
    }

    @Override
    public void deleteAll(List<UserDAO> userDAOs) {
        userDAOs.clear();
        System.out.println("The list is cleared:" + userDAOs.toString());
    }

    @Override
    public void saveAll(List<UserDAO> userDAOs) {
        for (int i = 0; i < userDAOs.size(); i++) {
            userDAOs.remove(i);
            System.out.println("The all userDAOs is saved: " + userDAOs.toString());
        }
    }

    @Override
    public List<UserDAO> getList(List<UserDAO> userDAOs) {
        List<UserDAO> newListUsers = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            newListUsers.set(i, userDAOs.get(i));
        }
        System.out.println("New List array is: " + newListUsers);
        return newListUsers;
    }

    @Override
    public void delete(List<UserDAO> userDAOs) {
        for (int i = 0; i < 2; i++) {
            userDAOs.remove(i);
            System.out.println("The rest of userDAOs is: " + userDAOs.toString());
        }

    }

}