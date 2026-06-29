package Basic;

public class MethodOverloading {

//    METHOD OVERLOADING

    static int addition_two (int a, int b) {
        return a+b;
    }
    static double addition_three(double a, double b, double c) {
        return a+b+c;
    }

//    VARIABLE ARGUMENTS (VARARGS)

    static void sum(int... num) {
        int total = 0;

        for (int n: num) {
            total += n;
        }
        System.out.println("Sum = "+total);
    }

//    PASS BY VALUE

    static void changeValue(int x) {
        x = 100;
        System.out.println("Inside Method = "+x);{}
    }

//    RECURSION METHOD

    static int fibonacci(int num){
        if (num == 0) return 0;
        if (num == 1) {
            return 1;
        } else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(addition_two(23,30));
        System.out.println(addition_three(12.23,23.3,34.00));

        sum(12,23);
        sum(12,23,34,45,56,7);

        int num = 50;
        changeValue(num);
        System.out.println("Outside Method = "+num);

        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
