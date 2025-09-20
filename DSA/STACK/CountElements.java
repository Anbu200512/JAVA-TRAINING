import java.util.Stack;
public class CountElements{
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        public void push(int value){
            stack.push(value);
        }
        public void countelement(){
            if(stack.isEmpty()){
               System.out.println("Stack is empty");
            }
            for(int val : stack){
             count++;
            }
            System.out.println(count);
        }
        
   }