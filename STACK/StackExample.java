import java.util.Stack;

class MyStack {
    private Stack<Integer> stack;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        stack = new Stack<>();
    }

 
    public void push(int value) {
        if (stack.size() == capacity) {
            System.out.println("Stack is full!");
            return;
        }
        stack.push(value);
        System.out.println(value + " pushed");
    }
    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println(stack.pop() + " popped");
    }

 
    public void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Top element: " + stack.peek());
    }

   
    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements: " + stack);
    }
}

public class StackExample {
    public static void main(String[] args) {
        MyStack s = new MyStack(3);

        s.push(10);
        s.push(20);
        
        s.display();

        s.pop();
        s.pop();
        s.pop();
        s.pop(); 
    }
}
