import java.util.*;
public class MaxMin{
    public static void main(String args[]){
        int arr[]={3,2,6,8,1,9,0};
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int min = arr[0];
        System.out.println("MAX = "+ max);
        System.out.println("MIN = "+ min);
    }
}