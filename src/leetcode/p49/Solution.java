package leetcode.p49;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static List<List<String>> groupAnagrams (String[] str) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!hashMap.containsKey(key)) {
                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }

    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
}
