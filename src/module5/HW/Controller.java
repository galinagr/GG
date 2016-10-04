package module5.HW;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;


class Controller {
    private API[] arrayOfApis = new API[3];

    Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        arrayOfApis[0] = bookingComAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        arrayOfApis[1] = googleAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        arrayOfApis[2] = tripAdvisorAPI;
    }

    public Controller(API[] arrayOfApis) {
        this.arrayOfApis = arrayOfApis;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] myRoomOne = arrayOfApis[0].findRooms(price, persons, city, hotel);
        Room[] myRoomTwo = arrayOfApis[1].findRooms(price, persons, city, hotel);
        Room[] myRoomThree = arrayOfApis[2].findRooms(price, persons, city, hotel);

        Room[] res1 = new Room[10];

        for (int i = 0; i < 10; i++) {
            res1[i].setPrice(500);
            res1[i].setPersons(2);
            res1[i].setId(i + 1);
        }

        Room[] rooms = new Room[1000];

        int roomsCount = 0;
        roomsCount++;
        //test array
        Room[] roomsNew = {new Room(1001, 200, "Kyiv", 2, Date.from(Instant.parse("12-Apr-2016")), "Avrora")};

        DAOOImpl daoo = new DAOOImpl();
        //
        for (int i = 0; i < roomsCount; i++)
            daoo.save(rooms[i]);
        return rooms;
    }

    Room[] save(Room[] room) {
        DAOHardImpl daoHard = new DAOHardImpl();
        Room[] res2 = new Room[10];
        for (Room aRes2 : res2) daoHard.save(aRes2);
        return res2;
    }

    int check(API api1, API api2) {
        // api1.findRooms(0, 0, null, null); option 1

        int price = 100;
        int persons = 2;
        String city = "Kiev";
        String hotel = "Holiday";

        Room[] res1 = api1.findRooms(price, persons, city, hotel);
        Room[] res2 = api2.findRooms(price, persons, city, hotel);

        Room[] roomsFromApi1 = api1.getAll();
        Room[] roomsFromApi2 = api2.getAll();

        int countRooms = 0;
        for (int i = 0; i < roomsFromApi1.length; i++) {
            if (Arrays.equals(roomsFromApi1, roomsFromApi2))
                countRooms++;
        }

        //create array with countRooms lentgth

        //for(int i = 0; i < roomsFromApi1.length; i++) {
        //check if rooms from two arrays are equal
        //countRooms++;
        // }

        //logic (!!!) KEY moment

        // return null;

        return countRooms;
    }
}