package tcs;

import java.util.Scanner;

public class Coordination_Geometry {
        public static void getDistance(int num) {
            int distance = 10;
            int x = 0;
            int y = 0;
            char ch = 'R';
            while (num > 0) {
                switch(ch) {
                    case 'R' :
                        x = x + distance;
                        ch = 'U';
                        distance = distance + 10;
                        break;
                    case 'U' :
                        y = y + distance;
                        ch = 'L';
                        distance = distance + 10;
                        break;
                    case 'L' :
                        x = x - distance;
                        ch = 'D';
                        distance = distance + 10;
                        break;
                    case 'D' :
                        y = y - distance;
                        ch = 'A';
                        distance = distance + 10;
                        break;
                    case 'A' :
                        x = x + distance;
                        ch = 'R';
                        distance = distance + 10;
                        break;
                }
                num--;
            }
            System.out.print(x+" "+y);
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            getDistance(num);
        }
    }
