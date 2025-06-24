public class VIPGuest extends Guest {
    String membershiplevel; 

    public VIPGuest() {
        super(); 
        this.membershiplevel = "Silver"; 
    }
    public VIPGuest(String name, String membershiplevel) {
        super(name); 
        this.membershiplevel = membershiplevel; 
    }

    public void printGuestInfo() {
        super.printGuestInfo(); 
        System.out.println("Membership Level: " + membershiplevel);
    }

    Guest[] guests = new Guest[5];
}
