
class snakeMatrix {
    public static void main(String[] args) {
          int[][] arr={{1,6,7},{9,18,15},{21,8,14}};
          int rows = arr.length;
          int cols = arr[0].length;
          for(int i =0 ;i<rows;i++){
              if(i%2==0){
                  for(int j = 0 ; j<cols ; j++){
                      System.out.print(arr[i][j]+" ");
                  }
              }
              else{
                  for(int j = cols-1 ; j>=0 ; j--){
                      System.out.print(arr[i][j]+" ");
                  }
              }
          }
    }
}