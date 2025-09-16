public class oddcount{
    public static void main(String args[]){
        // int[] arr = {3,6,7,23,44,65,78,21,56,58};
        // int n = arr.length;
        // int count = 0 ;
        // int max = 0 ;
        // for(int i = 0 ; i<n;i++){
        //     if(arr[i]%2==1){
        //         count++;
        //         max = Math.max(count,max);
        //         System.out.println(max);
        //     }
        //     else{
        //         count = 0;
        //     }
        // }
        String numStr = "367892534";
        int count = 0 ;
         int max = 0 ;
        for(char ch : numStr.toCharArray()) {
            if(ch%2==1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count = 0 ;
            }
        }
        System.out.println(max);
    }
}