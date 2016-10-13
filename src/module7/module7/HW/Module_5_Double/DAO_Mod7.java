package module7.module7.HW.Module_5_Double;

import java.util.List;

public interface DAO_Mod7 {
   Room save(Room room);


    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

     List<Room> getAll();
}