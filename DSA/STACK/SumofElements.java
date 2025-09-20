import java.util.Stack;
public class SumofElements{
    Stack<Integer> stack = new Stack<>();
    int sum = 0;

    public void push(int value){
        stack.push(value);
    }
    public void countingsum(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        for(int val : stack){
            sum = sum+val;
    }
    System.out.println(sum);
    }
    
}