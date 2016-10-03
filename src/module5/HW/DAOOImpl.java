package module5.HW;

import java.time.Instant;
import java.util.Date;

class DAOOImpl implements DAO {
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
    public Room findById(long id) {
        Room room = new Room(1002, 0, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Avrora");
        System.out.println(room.toString() + room.getId() + " is found");
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}