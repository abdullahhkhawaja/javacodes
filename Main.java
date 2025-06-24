import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Room myroom = new Room();
        myroom.printRoomStatus();

        Room myroom2 = new Room(56, "Suite");
        myroom2.printRoomStatus();

        System.out.println('\n');

        Hotel.displayHotelInfo();

        Guest ourguest = new Guest("Abdullah");
        System.out.println('\n');
        Guest ourguest2 = new Guest("Khawaja");
        System.out.println('\n');

        myroom.assignGuest(ourguest);

        myroom.assignGuest(ourguest2);
        // shows room already booked

        myroom2.assignGuest(ourguest2, 10);
        System.out.println('\n');

        myroom.printRoomStatus(); // shows room status was updated
        System.out.println('\n');

        VIPGuest vipguest = new VIPGuest("Ali", "Gold");
        vipguest.printGuestInfo();
        System.out.println('\n');

        LinkedList<Room> Housekeepinglist = new LinkedList<>();
        Housekeepinglist.add(myroom);
        Housekeepinglist.add(myroom2);

        System.out.print("Housekeeping rooms: ");
        for (Room room : Housekeepinglist) {
            System.out.print("[" + room.getRoomNumber() + "]" + " ");
        }

        Housekeepinglist.removeLast();
        System.out.println("\nAfter removing the last room:");
        for (Room room : Housekeepinglist) {
            System.out.print("[" + room.getRoomNumber() + "]" + " ");
        }

        System.out.println('\n');

        Guest[] guestArray = new Guest[5];

        System.out.println("Initial Guest Array:  ");
        guestArray[0] = new Guest("Babar Azam");
        guestArray[1] = new Guest("Imad Wasim");
        guestArray[2] = new Guest("Rizwan");
        guestArray[3] = new Guest("Shaheen");
        guestArray[4] = new Guest("Haris Rauf");

        for (int i = 0; i < guestArray.length; i++) {
            if (guestArray[i] != null) {
                guestArray[i].printGuestInfo();
            } else {
                System.out.println("Guest at index " + i + " is null.");
            }
        }
        System.out.println('\n');

        guestArray[1] = null;

        System.out.println("Guest Array after removal of guest at second index:  ");

        for (int i = 0; i < guestArray.length; i++) {
            if (guestArray[i] != null) {
                guestArray[i].printGuestInfo();
            } else {
                System.out.println("Guest at index " + i + " is null.");
            }
        }

        System.out.println('\n');

        HashMap<Integer, Guest> guestMap = new HashMap<>();
        guestMap.put(1, new Guest("Fakhar Zaman"));
        guestMap.put(2, new Guest("Mohammad Hafeez"));
        guestMap.put(3, new Guest("Shadab Khan"));
        guestMap.put(4, new Guest("Asif Ali"));
        

        for (Map.Entry<Integer, Guest> entry : guestMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getname());
        }

        System.out.println('\n');

        Guest guestatroom = guestMap.get(2);
        if (guestatroom != null) {
            System.out.println("Guest at room 2: " + guestatroom.getname());
        } else {
            System.out.println("No guest found at room 2.");
        }

        System.out.println('\n');

        HashSet<String> hotelAmenities = new HashSet<>();
        hotelAmenities.add("Free Wi-Fi");
        hotelAmenities.add("Swimming Pool");
        hotelAmenities.add("Gym");
        hotelAmenities.add("Spa");
        hotelAmenities.add("Free Breakfast");
        hotelAmenities.add("Free Wi-Fi"); // Duplicate, will not be added
        hotelAmenities.add("Parking");

        System.out.println("Hotel Amenities (Unique): " + hotelAmenities);

        System.out.println('\n');

        Stack<String> stack = new Stack<>();

        stack.push("Bag 1");
        stack.push("Bag 2");
        stack.push("Bag 3");
        stack.push("Bag 4");

        System.out.println("Luggage Stack before popping: " + stack);

        stack.pop();

        System.out.println("Luggage Stack after first pop: " + stack);

        System.out.println('\n');

        ReservationBST MyBST = new ReservationBST();

        MyBST.insert(0);
        MyBST.insert(1);
        MyBST.insert(2);
        MyBST.insert(3);
        MyBST.insert(5);
        MyBST.insert(4);

        System.out.println("Binary Reservation Tree :");

        MyBST.inorderdisplay();
        System.out.println('\n');

        boolean x = MyBST.search(4);
        if (x) {
            System.out.println("Reservation number 4 exists.");
        } else {
            System.out.println("Reservation number 4 does not exist.");
        }

        boolean y = MyBST.search(6);
        if (y) {
            System.out.println("Reservation number 6 exists.");
        } else {
            System.out.println("Reservation number 6 does not exist.");
        }

        System.out.println('\n');

        Hotel myHotel = new Hotel();
        myHotel.CheckIn(ourguest, myHotel);
        myHotel.CheckIn(ourguest2, myHotel);

        System.out.println('\n');

        Guest sameguest1 = new Guest("ABC");
        Guest sameguest2 = new Guest("ABC");
        Guest notsameguest = new Guest("CAB");

        System.out.println("guest1 equals guest2: " + sameguest1.equals(sameguest2));
        System.out.println("guest1 equals guest3: " + sameguest1.equals(notsameguest));
        
        System.out.println('\n');

        System.out.println("guest1 hashCode: " + sameguest1.hashCode());
        System.out.println("guest2 hashCode: " + sameguest2.hashCode());
        System.out.println("guest3 hashCode: " + notsameguest.hashCode());


        Hotel hotel2 = new Hotel(); 

         try {
            hotel2.CheckIn(1,ourguest,hotel2);
            System.out.println("\n");
            hotel2.CheckIn(1,ourguest2,hotel2);
            }
            catch (RoomNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println('\n');


        if (hotel2.Waitlist.isEmpty()) {
            System.out.println("Waitlist is empty");
        } else {
            System.out.println("Waitlist = " + hotel2.Waitlist); 
        }
        
        System.out.println('\n');

       Hotel hotel3 = new Hotel(); 
        
       Guest ourguest3 = new Guest("Ali");
       Guest ourguest4 = new Guest("Ahmed");
       Guest ourguest5 = new Guest("Sara");
       Guest ourguest6 = new Guest("Zara");
       Guest ourguest7 = new Guest("Bilal");
       Guest ourguest8 = new Guest("Hassan");


        hotel3.CheckIn(ourguest3, hotel3);
        hotel3.CheckIn(ourguest4, hotel3);
        hotel3.CheckIn(ourguest5, hotel3);
        hotel3.CheckIn(ourguest6, hotel3);
        hotel3.CheckIn(ourguest7, hotel3);
        hotel3.CheckIn(ourguest8, hotel3);  // This will add to waitlist as no rooms are available
        
        System.out.println('\n');

        if (hotel3.Waitlist.isEmpty()) {
            System.out.println("Waitlist is empty");
        } else {
            System.out.println("Waitlist = " + hotel3.Waitlist.getFirst().getname()); 
        } 
    }

}


