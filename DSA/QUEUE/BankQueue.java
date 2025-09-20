import java.util.*;
public class BankQueue{
    public static void main(String args[]){
        Queue<String> queue = new LinkedList<>();

        queue.add("ANBU");
        queue.add("SAGAR");
        queue.add("VISHNU");
        System.out.println("Initial Queue : " + queue);

        while(!queue.isEmpty()){
            String op = queue.remove();
            System.out.println(op);
        }
    }
}