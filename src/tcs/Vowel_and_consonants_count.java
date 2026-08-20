package tcs;

import java.util.Scanner;

public class Vowel_and_consonants_count {
    public static void count_vowels_and_consonents(String str) {
        str = str.toLowerCase();
        int count_vowels = 0;
        int count_consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
                    count_vowels+=1;
                } else {
                    count_consonants+=1;
                }
            }
        }
        System.out.println("Vowels: "+count_vowels);
        System.out.print("Consonants: "+(count_consonants));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        count_vowels_and_consonents(str);
    }
}
