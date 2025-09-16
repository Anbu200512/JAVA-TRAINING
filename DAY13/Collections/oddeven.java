import java.util.Stack;

public class oddeven {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> output = new Stack<>();

        for (int i = 2; i <= 10; i += 2) {
            stack1.push(i);
        }
        
        for(int i = 1 ; i <= 9 ; i+=2){
            if(i==9){
                stack2.push(2);
            }
            stack2.push(i);
        }

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) {
                output.push(stack1.pop());
            }
            if (!stack2.isEmpty()) {
                output.push(stack2.pop());
            }
        }
        while (!output.isEmpty()) {
            System.out.print(output.pop() + " ");
        }
    }
}
