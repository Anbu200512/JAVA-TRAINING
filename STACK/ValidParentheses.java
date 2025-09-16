import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Handle closing brackets
            else {
                if (stack.isEmpty()) {
                    return false; // Closing without opening
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatch
                }
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{[(])}";

        System.out.println(s1 + " → " + isValid(s1)); // true
        System.out.println(s2 + " → " + isValid(s2)); // false
    }
}
