package module7.module7.HW.Module_5_Double;

import java.util.List;

public interface API_Mod7 {
    List<Room> findRooms(int price, int persons, String city, String hotel);

    List<Room> getAll();
}