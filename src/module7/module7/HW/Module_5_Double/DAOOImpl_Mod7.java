package module7.module7.HW.Module_5_Double;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

class DAOOImpl_Mod7 implements DAO_Mod7 {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + "saved");
        return room;

    }

    @Override
    public boolean delete(Room room) {
        return room.getId() == 101;
    }

    @Override
    public Room update(Room room) {
        while (room.getId() == 101 && room.getPrice() == 400 && room.getPersons() == 2)
            room.setId(102);
            room.setPrice(500);
            room.setPersons(3);
        return null;
    }

    @Override
    public module7.module7.HW.Module_5_Double.Room findById(long id) {
        Room room = new Room(1002, 0, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Avrora");
        System.out.println(room.toString() + room.getId() + " is found");
        return null;
    }

    @Override
    public ArrayList<Room> getAll() {
        return new ArrayList<>();
    }
}