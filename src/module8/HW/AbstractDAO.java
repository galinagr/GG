package module8.HW;

import java.util.List;

public interface AbstractDAO <T>{

    List<T> DAO ();

    T save(List T);


    void delete(List T);
    void deleteAll(List T);
    void saveAll(List T);
    List <T> getList();

}
