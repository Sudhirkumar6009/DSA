package Basic;

public class Conditions {

//        if conditional statement based method

    public static boolean PrimeChecker(int num) {
        if (num<=1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PrimeChecker(89));

//        if....if.... Nested If condition

        int num = 30;
        if (PrimeChecker(num) == false) {
            System.out.println("30 is prime");
            if (num%2==0){
                System.out.println("30 is even also");
            }
        }

//        if....else-if....else condition

        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println("B is greater than A");
        } else if (a > b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("Both are equal");
        }

//        Switch....case....default statement

        switch (num) {
            case 30:
                System.out.printf("Num is 30");
                break;
            case 300:
                System.out.printf("Num is 300");
                break;
            default:
                System.out.println("Num is undefined");
                break;
        }
    }
}
