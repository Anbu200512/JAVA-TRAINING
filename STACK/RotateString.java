import java.util.Stack;
public class RotateString{
    public static void main(String args[]){
        String name = "anbumani";
        int k = 3;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < name.length();i++){
            stack.push(name.charAt(i));
        }
        Stack<Character> rotatedPart = new Stack<>();

        for(int i = 0 ; i < k ; i++){
            rotatedPart.push(stack.pop());
        }
        StringBuilder result = new StringBuilder();
        
        // Add the rotated part (reverse to keep original order)
        while (!rotatedPart.isEmpty()) {
            result.append(rotatedPart.pop());
        }
        // Add the remaining characters (bottom of stack is first)
        Stack<Character> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop()); // reverse stack order
        }
        while (!tempStack.isEmpty()) {
            result.append(tempStack.pop());
        }
        System.out.println("Rotated String: " + result);
    }
}