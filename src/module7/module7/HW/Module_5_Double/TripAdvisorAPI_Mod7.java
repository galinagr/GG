package module7.module7.HW.Module_5_Double;

import java.util.ArrayList;
import java.util.List;

public class TripAdvisorAPI_Mod7 implements API_Mod7 {
    private List<Room> rooms = new ArrayList<>();


    public TripAdvisorAPI_Mod7() {
        rooms.add(new Room(1001, 200, "Kyiv", 2, "01-02-2016", "Avrora"));

        rooms.add(new Room(1001, 200, "Kyiv", 2, "01-02-2016", "Sputnik"));

        rooms.add(new Room(1003, 202, "Kyiv", 2, "01-02-2016", "Ankor"));

        rooms.add(new Room(1004, 203, "Kyiv", 3, "01-02-2016", "Diamond"));

        rooms.add(new Room(1005, 204, "Kyiv", 1, "01-02-2016", "Parabelum"));


    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        for (int i=0; i<5; i++) {
            if (rooms.get(i).getPrice() == price && rooms.get(i).getPersons() == persons && rooms.get(i).getCityName().equals(city) && rooms.get(i).getHotelName().equals(hotel)) {
                System.out.println("found results:  " +rooms.toString());
            }
        }return rooms;
    }

    @Override
    public List<Room> getAll() {
        return new ArrayList<>();
    }
}