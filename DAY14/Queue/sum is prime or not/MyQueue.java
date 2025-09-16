 class MyQueue {
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
