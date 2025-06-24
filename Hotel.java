import java.util.LinkedList;

public class Hotel {
    Room[] rooms = new Room[5];
    LinkedList<Guest> Waitlist = new LinkedList<>();

    static String hotelName = "Pearl Continental Hotel";
    static String address = "Mall Road, Lahore";

    public static void displayHotelInfo() {
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Address: " + address);
    }
    public Hotel() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i + 2, "Standard");
        }
          for (int i = 1; i < rooms.length; i++) {
            rooms[i] = new Room(i + 2, "Suite");
        }
        
    }

    public void CheckIn(Guest guest, Hotel hotel)
    {
        for (int i=0; i < hotel.rooms.length; i++) {
    
            if (!hotel.rooms[i].isOccupied()) {
                hotel.rooms[i].assignGuest(guest);
                System.out.println("Guest " + guest.getname() + " checked into room " + hotel.rooms[i].getRoomNumber());
                return;
            }
        }
        Waitlist.add(guest); 

        System.out.println("No available rooms for guest " + guest.getname());
        return; 

    }

    public void CheckIn(int desiredroom, Guest guest, Hotel hotel) throws RoomNotAvailableException
    {
        if(!hotel.rooms[desiredroom].isOccupied())
        {
            hotel.rooms[desiredroom].assignGuest(guest);
            System.out.println("Guest " + guest.getname() + " checked into room " + hotel.rooms[desiredroom].getRoomNumber());
            return; 
        }
         throw new RoomNotAvailableException("The room is already occupied. Please choose another room.");
         
    }



}
