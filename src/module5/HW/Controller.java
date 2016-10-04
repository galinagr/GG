package module5.HW;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;


class Controller {
    private API[] arrayOfApis = new API[3];

    Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        arrayOfApis[3] = bookingComAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        arrayOfApis[3] = googleAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        arrayOfApis[3] = tripAdvisorAPI;
    }

    public Controller(API[] arrayOfApis) {
        this.arrayOfApis = arrayOfApis;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] myRoomOne = arrayOfApis[0].findRooms(price, persons, city, hotel);
        Room[] myRoomTwo = arrayOfApis[1].findRooms(price, persons, city, hotel);
        Room[] myRoomThree = arrayOfApis[2].findRooms(price, persons, city, hotel);
        System.out.println("new rooms:" + Arrays.toString(myRoomOne) + Arrays.toString(myRoomTwo) + Arrays.toString(myRoomThree));
                for (int i = 0; i < 10; i++) {
            myRoomOne[i].setPrice(500);
            myRoomTwo[i].setPersons(2);
            myRoomThree[i].setId(i + 1);
        }

        Room[] rooms = new Room[1000];

        int roomsCount = 0;
        roomsCount++;
        //test array

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

    int check(BookingComAPI bookingComAPI, TripAdvisorAPI tripAdvisorAPI, GoogleAPI googleAPI) {

        int price[] = {100, 200, 300};
        int persons[] = {2, 3, 4};
        String[] city = {"Kiev", "Lviv", "Odessa"};
        String[] hotel = {"Holiday", "Smart", "Quite"};

        Room[] resBookingCom = bookingComAPI.findRooms(price[0], persons[0], city[0], hotel[0]);
        Room[] resTripAdvisor = tripAdvisorAPI.findRooms(price[1], persons[1], city[1], hotel[1]);
        Room[] resGoogle = googleAPI.findRooms(price[2], persons[2], city[2], hotel[2]);

        Room[] roomsFromResBookingCom = bookingComAPI.getAll();
        Room[] roomsFromResTripAdvisor = tripAdvisorAPI.getAll();
        Room[] roomsFromResGoogle = googleAPI.getAll();

        int countRoomsInBookingCom = 0;


        for (Room aResBookingCom : resBookingCom) {
            if (Arrays.equals(resBookingCom, resBookingCom))
                countRoomsInBookingCom++;
        }

        int countRoomsInGoogle = 0;
        for (Room aResGoogle : resGoogle) {
            if (Arrays.equals(roomsFromResGoogle, roomsFromResGoogle))
                countRoomsInBookingCom++;
        }

        int countRoomsInTripAdvisor = 0;
        for (Room aResTripAdvisor : resTripAdvisor) {
            if (Arrays.equals(resTripAdvisor, resTripAdvisor))
                countRoomsInTripAdvisor++;
        }
        int resultedQuantity = countRoomsInTripAdvisor + countRoomsInBookingCom + countRoomsInGoogle;
        System.out.println("The quantity of equals rooms are:" + resultedQuantity);
        return resultedQuantity;

    }
}