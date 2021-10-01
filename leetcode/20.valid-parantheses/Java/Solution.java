import java.util.Stack;

/**
 * Solution
 * 20. Valid Parantheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if ((c == ')' && (stack.isEmpty() || stack.pop() != '('))
                    || (c == ']' && (stack.isEmpty() || stack.pop() != '[')) 
                    || (c == '}' && (stack.isEmpty() || stack.pop() != '{'))) {
                return false;
            }
        }
        return (stack.isEmpty()) ? true : false;
    }
}