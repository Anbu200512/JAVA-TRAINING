public class 2520{
    public static int main(String []args){
        int num = 121;
        int count=0;
        while(num!=0){
            int a = num%10;
            if(num % a == 0){
                count++;
            }
            int b = a;
            num=num/10;
        }
        return count;
    }
}