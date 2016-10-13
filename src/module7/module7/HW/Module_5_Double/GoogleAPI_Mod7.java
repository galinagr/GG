package module7.module7.HW.Module_5_Double;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI_Mod7 implements API_Mod7 {

    private List<Room> rooms = new ArrayList<>();

    public GoogleAPI_Mod7() {
        rooms.add(new Room(1001, 200, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Avrora"));

        rooms.add(new Room(1001, 200, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Sputnik"));

        rooms.add(new Room(1003, 202, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Ankor"));

        rooms.add(new Room(1004, 203, "Kyiv", 3, Date.from(Instant.parse("12-Apr-2016")), "Diamond"));

        rooms.add(new Room(1005, 204, "Kyiv", 1, Date.from(Instant.parse("12-Apr-2016")), "Parabelum"));


    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        for (int i=0; i<5; i++) {
            if (rooms.get(i).getPrice() == price && rooms.get(i).getPersons() == persons && rooms.get(i).getCityName().equals(city) && rooms.get(i).getHotelName().equals(hotel))
                return new ArrayList<>();
        }return null;
    }

    @Override
    public List<Room>getAll() {
        return new ArrayList<>();
    }
}