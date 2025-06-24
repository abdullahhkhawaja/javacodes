public class Staff extends Person{
    String name; 

    public Staff() {
        super(); 
        this.name = "Unknown Staff"; 
    }
    public Staff(String name) {
     //   super(name); 
        this.name = name; 
    }

    public void getRole() {
        System.out.println("Role: Staff");
    }

}
