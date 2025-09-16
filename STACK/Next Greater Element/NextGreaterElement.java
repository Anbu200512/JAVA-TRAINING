import java.util.Stack;

public class NextGreaterElement {

    public static void findNextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // While stack is not empty and current element is greater
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                System.out.println(stack.pop() + " --> " + arr[i]);
            }
            stack.push(arr[i]);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> -1");
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 2};
        findNextGreater(arr);
    }
}
