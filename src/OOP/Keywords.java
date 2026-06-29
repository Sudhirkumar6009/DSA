package OOP;

public class Keywords {
    int id;
    String name;

    static String clg_name = "GEC GANDHINAGAR"; // static KEYWORD
    final int age = 20;

    Keywords (int id, String name) {
        this.id = id;       // this KEYWORD
        this.name = name;   // this KEYWORD
    }
    void display() {
        System.out.println("ID : "+id+"\nName : "+name+"\nAge : "+age+ "\nCollege : "+clg_name);
    }
    public static void main(String[] args) {
        Keywords k = new Keywords(1,"Sudhir");
        k.display();
//        k.age = 25; --> SHOWS ERROR final keyword used
    }
}
