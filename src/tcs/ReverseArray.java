package tcs;
import java.util.*;

public class ReverseArray {
        public static ArrayList<Integer> sortByFreq(int arr[]) {
            Arrays.sort(arr);
            ArrayList<Integer> list = new ArrayList<>() ;
            for (int i = arr.length-1; i >= 0; i--) {
                list.add(arr[i]);
            }
            return list;
        }
        public static void main(String[] args) {
            int[] arr = {5,5,4,6,4};
            System.out.println(sortByFreq(arr));
        }
    }