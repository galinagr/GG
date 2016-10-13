package module7.module7.HW.Module_5_Double;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller_Mod7 controller = new Controller_Mod7();

        controller.requestRooms(100, 2, "Krakow", "HolidayInn");
        controller.requestRooms(150, 1, "Kyiv", "Radison");
        controller.requestRooms(280, 10, "London", "Test");

        controller.check(new BookingComAPI_Mod7(), new TripAdvisorAPI_Mod7(), new GoogleAPI_Mod7());

        List<Room> roomsNew = new ArrayList<>();
        roomsNew.get(0).setId(1001);
        roomsNew.get(0).setPrice(200);
        roomsNew.get(0).setCityName("Kyiv");
        roomsNew.get(0).setPersons(2);
        roomsNew.get(0).setDateAvailableFrom(Date.from(Instant.parse("12-Apr-2016")));
        roomsNew.get(0).setHotelName("Avrora");

        System.out.println("Room is:" + roomsNew.toString());

        controller.save(roomsNew);
    }
}