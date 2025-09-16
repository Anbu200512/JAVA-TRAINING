import java.util.*;

public class palindrome{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = scan.nextInt();
        int a;
        int c = n;
        int ans = 0;
        while(n!=0){
            a = n%10;
            ans = ans*10 + a;
            n = n/10;
        }
        if(c==ans){
            System.out.println("Num is Palindrome");
        }
        else{
             System.out.println("Num is not a Palindrome");
        }
    }
}