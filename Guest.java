import java.util.Objects;


public class Guest extends Person {
    private String name;
    
    public Guest() {
        name = "unknown"; 
    }

    public Guest(String name) {
        this.name = name;
    }
    public void setname(String name)
    {
        this.name = name; 

    }
    public String getname()
    {
        return name;  

    }
    public void printGuestInfo() {
        System.out.println("Guest Name: " + getname());
    }

    public void getRole() {
        System.out.println("Role: Guest");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        Guest otherGuest = (Guest) obj; 
        return name != null && name.equals(otherGuest.name);  
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
