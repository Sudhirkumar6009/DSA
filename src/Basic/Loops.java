package Basic;

public class Loops {
    public static void main(String[] args) {
//        FOR LOOP
        int sum = 0;
        for (int a=1;a<=10;a++){
            sum+=a;
        }
        System.out.println(sum);  // sum up to a = 0 to 10
//        WHILE LOOP
        int b=10;
        while (b<=100){
            System.out.println(b);
            b+=10;
        }
//        DO-WHILE LOOP
        int c = 10;
        do {
            System.out.println(c);
            c-=1;
        } while (c!=0);
//        FOR-EACH LOOP
        int arr[] = {12,23,34,45,56,67,78,89,90};
        for (int n: arr) {
            System.out.println(n);
        }
    }
}
