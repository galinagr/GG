package module5.HW;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(100, 2, "Krakow", "HolidayInn");
        controller.requestRooms(150, 1, "Kyiv", "Radison");
        controller.requestRooms(280, 10, "London", "Test");

        controller.check(new BookingComAPI(), new TripAdvisorAPI(),new GoogleAPI());

        Room[] roomsNew = {new Room(1001, 200, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Avrora")};

        System.out.println("Room is:" + Arrays.toString(roomsNew));

        controller.save(roomsNew);
    }
}