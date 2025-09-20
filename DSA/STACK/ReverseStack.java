import java.util.*;
public class ReverseStack{
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    void push(int value){
        stack.push(value);
    }

    void revStack(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
        }
         System.out.println("orginal Stack");
        for(int val : stack){
            System.out.print(val+" ");
        }
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
    }
    void display(){
       
        System.out.println("reverse Stack");
        for(int val : temp){
            System.out.print(val+" ");
        }
    }
}