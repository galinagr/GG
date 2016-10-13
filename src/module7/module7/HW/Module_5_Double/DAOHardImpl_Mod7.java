package module7.module7.HW.Module_5_Double;

import java.util.ArrayList;
import java.util.List;

public class DAOHardImpl_Mod7 implements DAO_Mod7 {
    //

    @Override
    public module7.module7.HW.Module_5_Double.Room save(module7.module7.HW.Module_5_Double.Room room) {
        room.setId(101);
        room.setPrice(600);
        room.setPersons(2);
        room.setCityName("Minsk");
        room.setHotelName("HolidayInn");
        System.out.println("Room updated details:" + room.getId() + room.getPrice() + room.getPersons() + room.getCityName() + room.getHotelName());
        return null;
    }

    @Override
    public boolean delete(module7.module7.HW.Module_5_Double.Room room) {
        return false;
    }

    @Override
    public module7.module7.HW.Module_5_Double.Room update(module7.module7.HW.Module_5_Double.Room room) {
        room.setId(101);
        room.setPrice(400);
        room.setPersons(2);
        room.setCityName("Kyiv");
        room.setHotelName("HolidayInn");
        System.out.println("Room updated details:" + room.getId() + room.getPrice() + room.getPersons() + room.getCityName() + room.getHotelName());
        return null;
    }

    @Override
    public List<module7.module7.HW.Module_5_Double.Room> getAll() {
        return new ArrayList<>();
    }

    @Override
    public module7.module7.HW.Module_5_Double.Room findById(long id) {
        return null;
    }
}
