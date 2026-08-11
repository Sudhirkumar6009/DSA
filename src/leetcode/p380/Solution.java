package leetcode.p380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Solution {

    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random random;

    public Solution() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {

        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int lastValue = list.get(list.size() - 1);
        list.set(index, lastValue);
        map.put(lastValue, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.insert(10));      // true
        System.out.println(obj.insert(20));      // true
        System.out.println(obj.insert(10));      // false

        System.out.println(obj.remove(10));      // true
        System.out.println(obj.remove(30));      // false

        System.out.println(obj.getRandom());    // 20
    }
}