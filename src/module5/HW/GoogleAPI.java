package module5.HW;

import java.time.Instant;
import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room1 = new Room(1001, 200, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Avrora");
        rooms[0] = room1;
        Room room2 = new Room(1001, 200, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Sputnik");
        rooms[1] = room2;
        Room room3 = new Room(1003, 202, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Ankor");
        rooms[2] = room3;
        Room room4 = new Room(1004, 203, "Kyiv", 3, Date.from(Instant.parse("12-Apr-2016")), "Diamond");
        rooms[3] = room4;
        Room room5 = new Room(1005, 204, "Kyiv", 1, Date.from(Instant.parse("12-Apr-2016")), "Parabelum");
        rooms[4] = room5;

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        for (int i=0; i<5; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName().equals(city) && rooms[i].getHotelName().equals(hotel))
                return new Room[0];
        }return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}