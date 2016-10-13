package module7.module7.HW.Module_5_Double;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        Controller_Mod7 controller = new Controller_Mod7();

        controller.requestRooms(100, 2, "Krakow", "HolidayInn");
        controller.requestRooms(150, 1, "Kyiv", "Radison");
        controller.requestRooms(280, 10, "London", "Test");

        controller.check(new BookingComAPI_Mod7(), new TripAdvisorAPI_Mod7(), new GoogleAPI_Mod7());

        List<Room> roomsNew = new ArrayList<>();
        roomsNew.add(0, new Room(1001, 200, "Kyiv", 2, "01-02-2016", "Avrora"));
        roomsNew.get(0).setId(2001);
        roomsNew.get(0).setPrice(200);
        roomsNew.get(0).setCityName("Kyiv");
        roomsNew.get(0).setPersons(2);
        roomsNew.get(0).setDateAvailableFrom("01-02-2016");
        roomsNew.get(0).setHotelName("Avrora");

        System.out.println("Room is:" + roomsNew.toString());

        controller.save(roomsNew);
    }
}