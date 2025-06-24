
public class Room implements Bookable {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;
    private Guest currentGuest;
    private int nights;

    // Default constructor
    public Room() {
        setRoomNumber(1);
        setRoomType("Single");
        setOccupied(false);
        currentGuest = null;
        nights = 0;
    }

    // Parameterized constructor
    public Room(int roomNumber, String roomType) {
        setRoomNumber(roomNumber);
        setRoomType(roomType);
        setOccupied(false);
        nights = 0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    @Override
    public boolean isAvailable(int roomNumber) {
        return !isOccupied;
    }

    public void assignGuest(Guest guest) {
        if (!isOccupied()) {
            currentGuest = guest;
            setNights(1);
            setOccupied(true);
            String.format("Assgined guest %s to room number %s",guest.getname(),getRoomNumber());
            System.out.println("Assigned guest: " + guest.getname() + " to room number: " + getRoomNumber() + " for 1 night.");
        } else {
            System.out.println("Room is already occupied.");
        }
    }

    public void assignGuest(Guest guest, int nights) {
        if (isAvailable(getRoomNumber())) {                                //implememting the interface
            currentGuest = guest;
            setNights(nights);
            setOccupied(true);
            System.out.println("Assigned guest: " + guest.getname() + " to room number: " + getRoomNumber() + " for " + nights + " nights.");
        } else {
            System.out.println("Room is already occupied.");
        }
    }

    public void printRoomStatus() {
        System.out.print("Room Number: " + getRoomNumber() +
                         ", Room Type: " + getRoomType() +
                         ", Is Occupied: " + isOccupied());
        if (isOccupied && currentGuest != null) {
            System.out.print(", Guest: " + currentGuest.getname() +
                             ", Nights: " + getNights());
        }
        System.out.println();
    }
}