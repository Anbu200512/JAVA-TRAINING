 class q2{
    private int front , rear , maxsize;
    private int[] queue;
    public q2(int size){
        maxsize = size ;
        queue = new int [maxsize];
        front = -1;
        rear = -1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("queue is fill");
            return;
        }
        if(front == -1){
            front = 0 ;
        }
        queue[++rear]=data;
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1 ;
    }
    public boolean isFull(){
        return rear == maxsize - 1;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue");
            return -1 ;
        }
        int value = queue[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
        return value ;     
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Qoeue is empty");
            return;
        }
        for(int i = front;i<=rear ; i++){
            System.out.println(queue[i] +" ");
        }
        System.out.println();
    }
}

public class q1{
    public static void main(String[] args) {
        q2 inQ = new q2(5);
        inQ.enqueue(10);
        inQ.enqueue(20);
        inQ.enqueue(30);
        inQ.display();
        System.out.println("Dequeued: " + inQ.dequeue());
        inQ.display();
    }
}