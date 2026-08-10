package leetcode.p380;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    private static ArrayList<Integer> list;
    private static HashMap<Integer, Integer> map;

    public Solution () {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    public static boolean insert (int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }
    public static boolean remove (int val) {
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
    public static int getRandom() {
    }
}
