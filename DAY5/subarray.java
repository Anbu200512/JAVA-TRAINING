public class subarray{
    public static void main(String args[]){
        int a[] = {1,1,1};
        int k = 2;
        int n = a.length;
        int count = 0;
        for(int i =0;i<n;i++){
            if(a[i]+a[i+1]==k){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(count);
    }
}