class Oddeven {
    private int[] queue;
    private int front, rear, maxSize , k;

    public Oddeven(int size) {
        this.maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        k = 11 ;
    }

    public void enqueue(int value) {
        if (rear < maxSize - 1) {
            queue[++rear] = value;
        } else {
            System.out.println("Queue is full!");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            return queue[front++];
        } else {
            return 0; 
        }
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}