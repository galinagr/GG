package module7.module7.HW.Module_5_Double;

import java.util.ArrayList;
import java.util.List;

class Controller_Mod7 {
    private List<API_Mod7> arrayOfApis = new ArrayList<>();

    Controller_Mod7() {
        BookingComAPI_Mod7 bookingComAPI = new BookingComAPI_Mod7();
        arrayOfApis.add(bookingComAPI);
        GoogleAPI_Mod7 googleAPI = new GoogleAPI_Mod7();
        arrayOfApis.add(googleAPI);
        TripAdvisorAPI_Mod7 tripAdvisorAPI = new TripAdvisorAPI_Mod7();
        arrayOfApis.add(tripAdvisorAPI);
    }

    public Controller_Mod7(List<API_Mod7> arrayOfApis) {
        this.arrayOfApis = arrayOfApis;
    }

    List<Room> requestRooms(int price, int persons, String city, String hotel) {

        List<Room> myRoomOne = arrayOfApis.get(0).findRooms(price, persons, city, hotel);
        List<Room> myRoomTwo = arrayOfApis.get(1).findRooms(price, persons, city, hotel);
        List<Room> myRoomThree = arrayOfApis.get(2).findRooms(price, persons, city, hotel);
        System.out.println("new rooms:" + myRoomOne + myRoomTwo + myRoomThree);
        for (int i = 0; i < 10; i++) {
            myRoomOne.get(0).setPrice(500);
            myRoomTwo.get(1).setPersons(2);
            myRoomThree.get(2).setId(i + 1);
        }

        List <Room> rooms = new ArrayList<>();

        int roomsCount = 0;
        roomsCount++;
        //test array

        DAOOImpl_Mod7 daoo = new DAOOImpl_Mod7();
        //
        for (int i = 0; i < rooms.size(); i++)
            daoo.save(rooms.get(i));
        return rooms;
    }

    List<Room> save(List<Room> room) {
        DAOHardImpl_Mod7 daoHard = new DAOHardImpl_Mod7();
        List<Room> res2 = new ArrayList<>();
        for (int i=0; i<res2.size(); i++) {
            daoHard.save(res2.get(i));
        }
       return res2;
    }

    int check(BookingComAPI_Mod7 bookingComAPI, TripAdvisorAPI_Mod7 tripAdvisorAPI, GoogleAPI_Mod7 googleAPI) {

        int price[] = {200, 100, 300};
        int persons[] = {2, 3, 4};
        String[] city = {"Kiev", "Lviv", "Odessa"};
        String[] hotel = {"Avrora", "Smart", "Quite"};

        List<Room> resBookingCom = bookingComAPI.findRooms(price[0], persons[0], city[0], hotel[0]);
        List<Room> resTripAdvisor = tripAdvisorAPI.findRooms(price[1], persons[1], city[1], hotel[1]);
        List<Room> resGoogle = googleAPI.findRooms(price[2], persons[2], city[2], hotel[2]);

        List<Room> roomsFromResBookingCom = bookingComAPI.getAll();
        List<Room> roomsFromResTripAdvisor = tripAdvisorAPI.getAll();
        List<Room> roomsFromResGoogle = googleAPI.getAll();

        int countRoomsInBookingCom = 0;


        for (Room aResBookingCom : resBookingCom) {
            if (resBookingCom.equals(roomsFromResGoogle))
                countRoomsInBookingCom++;
        }

        int countRoomsInGoogle = 0;
        for (Room aResGoogle : resGoogle) {
            if (roomsFromResGoogle.equals(resTripAdvisor))
                countRoomsInGoogle++;
        }

        int countRoomsInTripAdvisor = 0;
        for (Room aResTripAdvisor : resTripAdvisor) {
            if (resTripAdvisor.equals(resBookingCom))
                countRoomsInTripAdvisor++;
        }
        int resultedQuantity = countRoomsInTripAdvisor + countRoomsInBookingCom + countRoomsInGoogle;
        System.out.println("The quantity of equals rooms are:" + resultedQuantity);
        return resultedQuantity;

    }
}