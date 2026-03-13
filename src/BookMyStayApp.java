abstract class Room {
    private int beds;
    private double size;
    private double price;

    public Room(int beds, double size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public int getBeds() {
        return beds;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getRoomType();

    public void displayDetails() {
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq ft");
        System.out.println("Price: $" + price);
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 200, 100);
    }

    public String getRoomType() {
        return "Single Room";
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 350, 180);
    }

    public String getRoomType() {
        return "Double Room";
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 500, 300);
    }

    public String getRoomType() {
        return "Suite Room";
    }
}

public class BookMyStayApp {

    static int singleRoomAvailable = 5;
    static int doubleRoomAvailable = 3;
    static int suiteRoomAvailable = 2;

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("Welcome to Book My Stay App\n");

        single.displayDetails();
        System.out.println("Available Rooms: " + singleRoomAvailable);
        System.out.println("---------------------------");

        doubleRoom.displayDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailable);
        System.out.println("---------------------------");

        suite.displayDetails();
        System.out.println("Available Rooms: " + suiteRoomAvailable);
    }
}

