package leetcode;

import java.util.HashMap;

public class TCS_placement_coding {
    static void returnDict(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }
        System.out.println(hashMap);

        System.out.print("{");

        int[] count = {0};

        hashMap.forEach((key, value) -> {
            System.out.print(key + ":" + value);
            count[0]++;
            if (count[0] < hashMap.size()) {
                System.out.print(",");
            }
        });

        System.out.println("}");
    }
    public static void main(String[] args) {
        String str = "AASHISH";
        returnDict(str);
    }
}
