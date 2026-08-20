package tcs;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Frequency_Character {
    public static void freq_char(String str) {
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
        }
        for (char key: hashMap.keySet()) {
            System.out.println(key+":"+hashMap.get(key));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        freq_char(str);
    }
}
