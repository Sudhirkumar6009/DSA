package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

//        Adding Elements on Queue

        queue.add(50);
        queue.add(90);
        queue.add(30);
        queue.add(20);
        queue.add(10);

        System.out.println("Actual Queue : " + queue); // Queue adds them all in Priority based ordering

//        Removing Elements from Queue

        queue.remove(90);

        System.out.println("Removed 10 from Queue : " + queue);

        queue.poll();

        System.out.println("Removed head element from Queue : " + queue);

//        Accessing Elements on Queue

        System.out.println("Top/Head Element of Queue : "+queue.peek());

        System.out.println("Head Element of Queue : "+queue.element());

//        Iteration of Queue

        for (Integer integer : queue) {
            System.out.println(integer + " ");
        }

    }
}
