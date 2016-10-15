package module8.HW;

import java.util.List;

interface AbstractDAO<T> {

    T save(List<T> list);

    void delete(List<T> list);

    void deleteAll(List<T> list);

    void saveAll(List<T> list);

    List<T> getList(List<T> list);

}