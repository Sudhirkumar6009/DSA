package Basic;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean flag = true;
//        Arithmetic Operators
        System.out.println(a + b);      // Addition
        System.out.println(a - b);      // Subtraction
        System.out.println(a * b);      // Multiplication
        System.out.println(a / b);      // Division
        System.out.println(a % b);      // Modulo
//        Unary Operators
        System.out.println(+a);         // Positive Value
        System.out.println(-a);         // Negative Value
        System.out.println(a++);        // Incrementing Operator (by 1)
        System.out.println(a--);        // Decrementing Operator (by 1)
        System.out.println(!flag);      // Reverse boolean value
        a = 10;
//        Assignment Operators
        System.out.println(a=11);       // Simple Assignment
        System.out.println(a+=5);       // Assigns a=a+5
        System.out.println(a-=10);      // Assigns a=a-5
        System.out.println(a*=2);       // Assigns a=a*5
        System.out.println(a/=2);       // Assigns a=a/5
        System.out.println(a%=1);       // Assigns a=a%1
//        Relational Operators (Returns Boolean ans)
        int c = 30;
        int d = 50;
        System.out.println(c==d);
        System.out.println(c!=d);
        System.out.println(c<d);
        System.out.println(c>d);
        System.out.println(c<=d);
        System.out.println(c>=d);
//        Logical Operators
        int num = 20;
        boolean is_true = true;
        System.out.println(num >= 18 && is_true);       // Checks both condition must be satisfy (AND)
        System.out.println(num <= 18 || is_true);       // Checks any one condition must be satisfy (OR)
        System.out.println(!is_true);                   // NOT operator
//        Ternary Operator
        int num1 = 20;
        int num2 = 3;
        System.out.println(num1>num2 ? "Num1 is greater" : "num2 is greater");
//        Bitwise Operator

        int bit_1 = 5;
        int bit_2 = 15;
        System.out.println(bit_1 & bit_2);          // 0101 (AND) 1111 = 0101 -> 5
        System.out.println(bit_1 | bit_2);          // 0101 (OR) 1111 = 1111 -> 15
        System.out.println(bit_1 ^ bit_2);          // 0101 (XOR) 1111 = 1010 -> 10
        System.out.println(~bit_1);
//         00000000 00000000 00000000 00000101
//                      (NOT)
//         11111111 11111111 11111111 11111010          -> -6
        System.out.println(bit_1);
        System.out.println(bit_1<<2);               // (Left Shift by 2) 000000101 -> 00001010 -> 00010100 -> 16+4=20
        System.out.println(bit_2>>2);               // (Right Shift by 2)  -> 00001111 -> 00000111 -> 00000011 -> 3

    }
}
