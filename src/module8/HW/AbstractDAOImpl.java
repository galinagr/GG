package module8.HW;

import java.util.List;

public class AbstractDAOImpl implements AbstractDAO<UserDAO> {


    @Override
    public UserDAO save(List<UserDAO> list) {
        list.add(1, new UserDAO(1, "kkk"));
        System.out.println(list.toString() + "saved");
        return null;
    }

    @Override
    public void delete(List<UserDAO> list) {
        list.remove(0);
    }

    @Override
    public void deleteAll(List<UserDAO> list) {
        list.clear();

    }

    @Override
    public void saveAll(List<UserDAO> list) {
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getId() > 12)
                list.set(i, new UserDAO(i, "gdg")).setId(12);
        }

    }

    @Override
    public List<UserDAO> getList(List<UserDAO> list) {
        list.get(0);
        list.get(1);
        list.get(3);
        return list;
    }
}