package OOP;

public class Constructors {

//    CONSTRUCTOR OVERLOADING --> MULTIPLE CONSTRUCTORS

    Constructors() {    // DEFAULT CONSTRUCTOR
        System.out.println("Default Constructor");
    }

    double length;
    double width;

    Constructors (double l, double w) { // PARAMETERIZED CONSTRUCTOR
        length = l;
        width = w;
    }
    void area() {
        System.out.println("Area = "+(length*width));
    }

    public static void main(String[] args) {
        Constructors c = new Constructors(1.2,3.23);
        c.area();
        Constructors c2 = new Constructors();
    }
}
