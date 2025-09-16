public class twopointer {
    public static void main(String args[]) {
        int array[] = {1, -2, 3, 4, -5, 8, -11, 13};
        int n = array.length;
        int[] positive = new int[n];
        int[] negative = new int[n];
        int posindex = 0;
        int negindex = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                negative[negindex++] = array[i];
            } else {
                positive[posindex++] = array[i];
            }
        }
        sortAscending(negative, negindex);
        sortAscending(positive, posindex);

        for (int i = 0; i < negindex; i++) {
            System.out.print(negative[i] + " ");
        }

        for (int i = 0; i < posindex; i++) {
            System.out.print(positive[i] + " ");
        }
    }

    public static void sortAscending(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
