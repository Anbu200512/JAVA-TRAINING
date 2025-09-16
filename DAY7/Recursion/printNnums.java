import java.util.Scanner;
public class printNnums{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to print first N natural numbers:");
        int n = scan.nextInt();
        printNumbers(n);
    }
    
    public static void printNumbers(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
