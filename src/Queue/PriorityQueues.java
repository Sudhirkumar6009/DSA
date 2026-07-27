package Queue;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        Adding elements on Priority Queue

        pq.add(3);
        pq.add(10);
        pq.add(7);
        pq.add(1);
        pq.add(2);

        System.out.println("Elements of Priority Queue : "+pq);

        System.out.println("Heapified Priority Queue : " + pq); // Follows Binary Heap method to append

        System.out.println("Peek Element of Priority Queue : " + pq.peek());

//        Removing elements on Priority Queue

        pq.remove(10);

        System.out.println("Priority Queue after removing element 10 : "+pq);

        pq.poll();

        System.out.println("Removing top/Head Element of Priority Queue : "+pq);

//        Iterating each element on Priority Queue

        for (Integer element: pq) {
            System.out.print(element+" ");
        }
    }
}
