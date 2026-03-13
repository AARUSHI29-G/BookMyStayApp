import java.util.HashMap;
import java.util.Map;

/*
 * Room Class
 * Stores room details
 */
class Room {

    private String roomType;
    private int beds;
    private int size;
    private double pricePerNight;

    // Constructor
    public Room(String roomType, int beds, int size, double pricePerNight) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getBeds() {
        return beds;
    }

    public int getSize() {
        return size;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}

/*
 * Use Case 3: Centralized Room Inventory Management
 * @version 3.0
 */
class RoomInventory {

    // Stores available room count for each room type
    private Map<String, Integer> roomAvailability;

    // Constructor initializes inventory
    public RoomInventory() {

        roomAvailability = new HashMap<>();

        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    // Returns map of room type to available count
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    // Updates availability for a specific room type
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}

/*
 * MAIN CLASS
 * BookMyStay Application
 * @version 3.0
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        // Create room objects
        Room singleRoom = new Room("Single Room", 1, 250, 1500.0);
        Room doubleRoom = new Room("Double Room", 2, 400, 2500.0);
        Room suiteRoom = new Room("Suite Room", 3, 750, 5000.0);

        // Create inventory
        RoomInventory inventory = new RoomInventory();

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Hotel Room Inventory Status\n");

        System.out.println("Single Room:");
        System.out.println("Beds: " + singleRoom.getBeds());
        System.out.println("Size: " + singleRoom.getSize() + " sqft");
        System.out.println("Price per night: " + singleRoom.getPricePerNight());
        System.out.println("Available Rooms: " + availability.get("Single Room"));
        System.out.println();

        System.out.println("Double Room:");
        System.out.println("Beds: " + doubleRoom.getBeds());
        System.out.println("Size: " + doubleRoom.getSize() + " sqft");
        System.out.println("Price per night: " + doubleRoom.getPricePerNight());
        System.out.println("Available Rooms: " + availability.get("Double Room"));
        System.out.println();

        System.out.println("Suite Room:");
        System.out.println("Beds: " + suiteRoom.getBeds());
        System.out.println("Size: " + suiteRoom.getSize() + " sqft");
        System.out.println("Price per night: " + suiteRoom.getPricePerNight());
        System.out.println("Available Rooms: " + availability.get("Suite Room"));
    }
}