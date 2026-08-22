package tcs;

import java.util.Stack;

public class Postfix_Evaluation_using_Stack {
    public static int postfix_Evaluate(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            if (Character.isDigit(postfix.charAt(i))) {
                stack.push(Integer.parseInt(String.valueOf(postfix.charAt(i))));
            } else {
                int right = stack.pop();
                int left = stack.pop();
                int ans = switch (postfix.charAt(i)) {
                    case '+' -> left + right;
                    case '-' -> left - right;
                    case '*' -> left * right;
                    case '/' -> left / right;
                    case '%' -> left % right;
                    default -> 0;
                };
                stack.push(ans);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix = "13+213*%23+-23/233+";
        System.out.println(postfix_Evaluate(postfix));
    }
}
