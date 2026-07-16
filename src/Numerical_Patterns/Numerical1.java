package Numerical_Patterns;

public class Numerical1 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            num-=2;
            for (int j = 1; j < i; j++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}
