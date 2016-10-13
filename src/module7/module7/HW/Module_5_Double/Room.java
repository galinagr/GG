package module7.module7.HW.Module_5_Double;

public class Room {
    private long id;
    private int price;
    private String cityName;
    private int persons;
    private String dateAvailableFrom;
    private String hotelName;

    Room(long id, int price, String cityName, int persons, String dateAvailableFrom, String hotelName) {
        this.id = id;
        this.price = price;
        this.cityName = cityName;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", cityName='" + cityName + '\'' +
                ", persons=" + persons +
                ", dateAvailableFrom='" + dateAvailableFrom + '\'' +
                ", hotelName='" + hotelName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Room room = (Room) object;

        /*if(id != 0) {
            if (id != room.id) return false;
        }*/

        if (price != 0) {
            if (price != room.price) return false;
        }

        if (cityName != null) {
            if (!cityName.equals(room.cityName)) return false;
        }

        if (persons != 0) {
            if (persons != room.persons) return false;
        }

        //null.methods - as a result nullPointerException

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + persons;
        return result;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public String getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(String dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}