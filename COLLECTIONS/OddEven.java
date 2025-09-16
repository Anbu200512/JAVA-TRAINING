import java.util.*; 
public class OddEven {
    LinkedList<Integer> list = new LinkedList<>();
    Stack<Integer> listOdd = new Stack<>();
    Stack<Integer> listEven = new Stack<>();
    LinkedList<Integer> Newlist = new LinkedList<>();
    boolean even = false;
    boolean odd = false;
    int len = list.size();
    int k = 2;

    public void add(int n){
        list.add(n);
    }
    // public void getK(int k){
    //     getK(k);
    // }

    public void splitOddEven(){
     

        for(int val : list){
            if(val%2==0){
                 listEven.push(val);
            }
            else{
                listOdd.add(val);
            }
           
        }
        for (int i = 0; i < k; i++) {
            int temp = listEven.pop();
            listEven.insertElementAt(temp, 0);
        }
        
        System.out.println(list);
        System.out.println(listEven);
        System.out.println(listOdd);

        for(int i : list){
            if(i%2==0){
                Newlist.add(listEven.pop());
            }
            else{
                Newlist.add(listOdd.pop());
            }
        }

        System.out.println(Newlist.reversed());
    }

    public void display(){
        splitOddEven();
    }

    public static void main(String[] args) {
        OddEven oe = new OddEven();
        // oe.getK(2);
        oe.add(2);
        oe.add(5);
        oe.add(8);
        oe.add(11);
        oe.add(14);
        oe.add(7);
        oe.display();
    }
}
