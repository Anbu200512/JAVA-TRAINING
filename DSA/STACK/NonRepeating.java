import java.util.*;
public class NonRepeating{
    Stack<Integer> stack = new Stack<>();
    void push(int value){
        stack.push(value);
    }
    void checkrep(){
        for(int val : stack){
                if (val!=val++){
                    System.out.print(val);
                }
            }
        }
    }