package OOP;

// CLASS
class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID = "+id+"\nName = "+name);
    }
}
public class Class {
    public static void main(String[] args) {
        Student c = new Student(); // OBJECT
        c.id = 1;
        c.name = "Sudhir";
        c.display();

        Student c2 = new Student(); // OBJECT 2
        c.id = 2;
        c.name = "Raj";
        c.display();

    }
}
