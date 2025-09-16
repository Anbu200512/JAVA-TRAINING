public class shifting0{
    public static void main(String[] args) {
        int []arr = {1,3,0,14,0,8,0};
        int n  = arr.length;
        int index = 0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < n) {
            arr[index] = 0;
            index++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}