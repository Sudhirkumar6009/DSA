package Stack;

import java.util.Stack;

public class MonotonicStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

//        Push/Adding Elements on Stack

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

//        Accessing Elements from Stack

        System.out.println("Initial Stack : "+stack);

        System.out.println("Top Element of Stack is : "+stack.peek());

//        Removing Elements from Stack

        System.out.println("Popped Top Element : "+stack.pop());

        System.out.println("Overview of Stack : "+stack);

//        Checking conditions of Stack

        System.out.println("Check that is stack is empty ? : "+stack.isEmpty());

    }
}
