import java.util.*;
public class FindMinstack{
    Stack<Integer> mainstack = new Stack<>();
    int m=Integer.MAX_VALUE;
    void push(int value){
        mainstack.push(value);
    }
    void minval(){
        for(int val : mainstack){
            if(m>val){
                m=val;
            }
        }
        System.out.println(m);
    }

}