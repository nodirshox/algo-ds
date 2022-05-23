package src.problems.easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        // https://leetcode.com/problems/valid-parentheses/
        System.out.println("Valid Parentheses");

        String input = "()[]{}";
        System.out.println(isValid(input) == true);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
                continue;
            }
            char thePeek = '-';
            if (!stack.empty()) {
                thePeek = stack.peek();
            }

            if (
                    (thePeek == '(' && current == ')') ||
                            (thePeek == '[' && current == ']') ||
                            (thePeek == '{' && current == '}')
            ) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        return stack.empty();
    }
}
