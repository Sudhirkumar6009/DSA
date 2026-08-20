package tcs;

import java.util.HashMap;
import java.util.Scanner;

public class Check_Anagram_From_TwoStrings {
    public static void checkAnagram(String str, String str2) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch: str.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }
        for (char ch : str2.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)-1);
        }
        boolean is_Anagram = false;
        for (char key : hashMap.keySet()) {
            if (hashMap.get(key) == 0) {
                is_Anagram = true;
                break;
            }
            else break;
        }
        System.out.println(is_Anagram ? "Anagram" : "Not Anagram");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = scan.nextLine();
        checkAnagram(str,str2);
    }
}
