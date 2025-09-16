

public class Main {
    public static void main(String[] args) {
        int[][] arr={{1,6,7},{9,18,15},{21,8,14}};
        int top =0;
        int bottom = arr.length-1;
        int left=0;
        int right= arr[0].length-1;
        while(top<=bottom && left<=right){
            for(int i = left ; i<=right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int j = top ; j<=bottom ; j++ ){
                 System.out.print(arr[j][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int k = right ; k>=left;k--){
                    System.out.print(arr[bottom][k]+" ");
                }
                bottom--;
            if(left<=right){
                for(int a = bottom;a>=top ; a--){
                     System.out.print(arr[a][left]+" ");
                }
                left++;
            }
            }
        }
    }
}