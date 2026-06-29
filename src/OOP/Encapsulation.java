package OOP;

public class Encapsulation {
    private String name;    // Encapsulated data and accessed through getter and setter method
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        en.setName("Sudhir");
        System.out.println(en.getName());
    }
}
