public class countPrimes {
    public static void main(String [] args) {
        int n = 6;
        int index=0;
      for(int i = 2; i<=n ; i++){
        int count = 0;
        for(int j =1; j<=i ; j++){
            if((i%j)==0){
                count++;
            }
        }
        if(count==2){
            index++;
        }
      }
      System.out.println(index);
    }   
}