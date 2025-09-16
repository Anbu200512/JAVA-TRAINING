public class PrimeQueueSum {
    static class MyQueue {
        private int front, rear, size;
        private int[] queue;

        public MyQueue(int maxSize) {
            size = maxSize;
            queue = new int[size];
            front = -1;
            rear = -1;
        }

        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) front = 0;
            queue[++rear] = data;
        }

        public int sum() {
            int sum = 0;
            for (int i = front; i <= rear; i++) {
                sum += queue[i];
            }
            return sum;
        }

        public void display() {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    } 

    public static void main(String[] args) {
        // Create two custom queues
        MyQueue q1 = new MyQueue(5);
        MyQueue q2 = new MyQueue(5);

        // Enqueue elements
        q1.enqueue(5);
        q1.enqueue(7);
        q1.enqueue(3);

        q2.enqueue(2);
        q2.enqueue(4);

        // Display queues
        System.out.print("Queue 1: ");
        q1.display();
        System.out.print("Queue 2: ");
        q2.display();

        // Get total sum
        int totalSum = q1.sum() + q2.sum();
        System.out.println("Total Sum = " + totalSum);

        // Check prime
        if (isPrime(totalSum)) {
            System.out.println("The sum is a PRIME number.");
        } else {
            System.out.println("The sum is NOT a prime number.");
        }
    }
}
