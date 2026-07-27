package Queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MonotonicQueue {
    static Deque<Integer> increasing_monotonic_queue (int arr[], int n) {
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && q.getLast() > arr[i]) {
                q.removeLast();
            }
            q.addFirst(arr[i]);
        }
        return q;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;

        Deque<Integer> q = increasing_monotonic_queue(arr, n);
        Iterator it = q.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
