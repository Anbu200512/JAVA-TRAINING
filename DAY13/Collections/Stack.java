class Stack {
    int top1 = -1;
    int top2 = -1;
    int maxSize = 5;
    int[] stack1 = {6,8,9,11,4};
    int[] stack2 = {1,2,3,4,5};
    int[] output = new int[maxSize];
    int index = 0;

    void push1(int value) {
        if (top1 == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack1[++top1] = value;
        int pushed1 = value;
        // System.out.println("Pushed " + value);
    }
    void push2(int value) {
        if (top2 == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack2[++top2] = value;
        int pushed2 = value;
        // System.out.println("Pushed " + value);
    }

    void pop() {
        if (top1 == -1) {
            System.out.println("Stack Underflow: Cannot pop from empty stack");
            return;
        }
        else{
             output[index] = stack1[top1--] + stack2[top2--] ;
             
        }
        index++;
        // System.out.println("Popped sum " + (stack1[top1--] + stack2[top2--]));
    }
    void display(){
        for(int i = maxSize-1; i< maxSize; i--){
            System.out.print(output[i]+" ");
        }
    }

}
