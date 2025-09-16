public class 1480{
    public static void main(String args[]){
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0 ; i< n ; i++){
            sum = sum + nums[i];
            arr[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}