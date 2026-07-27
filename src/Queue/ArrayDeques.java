package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDeques {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

//        Adding elements on ArrayQueue

        deque.add(100);
        deque.addFirst(20);
        deque.addLast(30);

        deque.offer(500);
        deque.offerFirst(90);
        deque.offerLast(2000);

        System.out.println("Overview of Deque : "+deque);

        System.out.println("Display first element of Deque : "+deque.peek());

//        Removing elements on ArrayQueue

        System.out.println("Removal of Last element of Deque : "+deque.removeLast());

        System.out.println("Overview of Deque : "+deque);

        System.out.println("popped first element of deque : "+deque.pop());

        System.out.println("Overview of Deque : "+deque);

        System.out.println("Removed first element of deque using poll method : "+deque.poll());

        System.out.println("Overview of Deque : "+deque);

//        Iterating each element through Deque

        for (Iterator<Integer> itr = deque.iterator();
            itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
    }
}
