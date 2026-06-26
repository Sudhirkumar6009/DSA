package Basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
//        Scanner class for input operation from user
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Your name is : " + name);

//        BufferedReader for reading external file
        try {
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Sudhir\\OneDrive\\Desktop\\DSA\\src\\Basic\\file.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        }
        catch(Exception e) {
            System.out.println("Exception Raised : "+e);
        }

//      PrintStream method that converts primitive (int, char) data into text formats instead of bytes
        try {
            String data = "This data is Streamming from PrintData";
            PrintStream ps = new PrintStream("C:\\Users\\Sudhir\\OneDrive\\Desktop\\DSA\\src\\Basic\\file.txt");
            ps.print(data);
            ps.close();
        } catch (Exception ae) {
            System.out.println("Exception Raised : "+ ae);
        }

//      printf method working like C lang
        double pi = 3.1415926535;
        System.out.printf("My name is %s, I am %d year old.\n", "Sudhir", 20);
        System.out.printf("Value of PI is : %.2f%n",pi);
    }
}
