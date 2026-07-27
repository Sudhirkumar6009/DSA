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
        System.out.println();

//        Using ArrayDeque as Stack

        System.out.println("----------");
        Deque<Integer> array_deque  = new ArrayDeque<>();

        array_deque.push(12);
        array_deque.push(1);
        array_deque.push(12);
        array_deque.push(102);

        System.out.println("Array Deque : "+array_deque);

        System.out.println("Popping each element as Stack (LIFO) -> ");
        while(!array_deque.isEmpty()) {
            System.out.print("Popped element : "+ array_deque.pop()+" \n");
        }

    }
}
