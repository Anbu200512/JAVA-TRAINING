import java.util.*;

public class List{
    LinkedList<Integer> list = new LinkedList<>();
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MIN_VALUE;
    public void add(int n){
         list.add(n);
    }
    public void SecondGratest(){
        int sum = 0;
        int count = 0;
        int max = 0;
       for(int number : list){
            count++;
            sum = sum + number;
            if(!list.isEmpty()){
                int a = number;
            if(a>min){
                max = min;
                min = a;
            }
            }
        }
        int avg = sum/count;
        System.out.println("Total element in the List : "+sum);
        System.out.println("Second Max in the List : "+max);
        System.out.println("Average of the List : "+avg);
        if(avg<min){
            for(int val : list){
                stack.push(val);
            }
            System.out.println(stack.reversed());
        }
        else{
            System.out.println(list);
        }
    }
    public static void main(String args[]){
        List finder   = new List();
        finder .add(37);
        finder .add(38);
        finder .add(39);
        finder .add(40);
        finder .add(100);
        finder .SecondGratest();
    }
}