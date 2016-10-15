package module8.HW;

import java.util.List;

public class AbstractDAOImpl implements AbstractDAO<UserDAO> {


    @Override
    public UserDAO save(List<UserDAO> list) {
        System.out.println(list.toString() + "saved");
        return null;
    }

    @Override
    public void delete(List<UserDAO> list) {

    }

    @Override
    public void deleteAll(List<UserDAO> list) {

    }

    @Override
    public void saveAll(List<UserDAO> list) {

    }

    @Override
    public List<UserDAO> getList(List<UserDAO> list) {
        return null;
    }
}