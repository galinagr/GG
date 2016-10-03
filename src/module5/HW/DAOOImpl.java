package module5.HW;

import java.time.Instant;
import java.util.Date;

public class DAOOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + "saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(1002, 0, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Avrora");
        System.out.println(room.toString() + room.getId() + " is found");
        return room;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}