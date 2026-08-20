package tcs;

import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int column = scan.nextInt();
        int[][] a = new int[row][column];
        int[][] b = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println("");
        }
    }
}
