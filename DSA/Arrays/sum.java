public class sum{
    public static void main(String args[]){
        int arr[] = {-1,-2,6,2,1,-5,5};
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            sum = sum+ arr[i];
        }
        System.out.println(sum);
    }
}