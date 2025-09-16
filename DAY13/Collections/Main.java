public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push1(6);
        s.push2(1);
        s.push1(8);
        s.push2(2);
        s.push1(9);
        s.push2(3);
        s.push1(11);
        s.push2(4); 
        s.push1(4);
        s.push2(5);     
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.display();
        

    }
}