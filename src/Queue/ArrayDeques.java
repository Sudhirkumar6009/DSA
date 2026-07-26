package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeques {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

//        Adding elements on ArrayQueue

        deque.add(10);
        deque.addFirst(20);
        deque.addLast(30);

        System.out.println(deque);

//        Adding elements on ArrayQueue

    }
}
