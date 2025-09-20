import java.util.Stack;
public class EmptyorNot{
    public static void main(String []args){
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(30);
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        for(int val : stack){
            System.out.print(val + " ");
        }
    }
}