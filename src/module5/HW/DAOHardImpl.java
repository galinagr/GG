package module5.HW;

public class DAOHardImpl implements DAO {
    //

    @Override
    public Room save(Room room) {
        room.setId(101);
        room.setPrice(600);
        room.setPersons(2);
        room.setCityName("Minsk");
        room.setHotelName("HolidayInn");
        System.out.println("Room updated details:" + room.getId() + room.getPrice() + room.getPersons() + room.getCityName() + room.getHotelName());
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        room.setId(101);
        room.setPrice(400);
        room.setPersons(2);
        room.setCityName("Kyiv");
        room.setHotelName("HolidayInn");
        System.out.println("Room updated details:" + room.getId() + room.getPrice() + room.getPersons() + room.getCityName() + room.getHotelName());
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
