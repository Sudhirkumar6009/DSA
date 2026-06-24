package Basic;

public class Methods {
//    BASIC METHOD WITHOUT PARAMETERS

    static int sum() {
        return 10 + 20 ;
    }

//    METHOD WITH PARAMETERS

    static int sum(int a, int b) {
        return a + b;
    }

//    VOID METHOD

    static void greet() {
        System.out.println("Hello There !");
    }

//    NON-STATIC METHODS

    void hi() {
        System.out.println("NON-STATIC HI !");
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(12,23));
        greet();
        Methods non_static = new Methods();     // Requires object for non-static methods
        non_static.hi();
    }
}
