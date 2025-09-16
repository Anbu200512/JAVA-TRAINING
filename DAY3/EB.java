// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class EB{
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Consumer Name : ");
        String name = scan.nextLine();
        System.out.println("Enter the Consumer Number : ");
        int cnum = scan.nextInt();
        System.out.println("Enter the Previous meter reading : ");
        int pmr = scan.nextInt();
        System.out.println("Enter the Current meter reading : ");
        int cmr = scan.nextInt();
        System.out.println("Tariff Category (Domestic Enter 1) (Commercial Enetr 2 ) : " );
        int tc = scan.nextInt();
        
        int unit = cmr - pmr;
        
        System.out.println("============BILL===========");
        System.out.println("Consumer Name : " + name);
        System.out.println("Consumer Number : " + cnum);
        System.out.println("Total Unit  : " + unit);
        int ammount;
        switch (tc){
            case 1:
                if(unit <= 100){
                    System.out.println("you no need to pay");
                }
                else if(unit <= 200){
                   ammount = unit*5; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                else if(unit <= 300){
                   ammount = unit*10; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                else if(unit <= 400){
                   ammount = unit*15; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                else if(unit <= 500){
                   ammount = unit*20; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                else if(unit > 500){
                   ammount = unit*25; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                break;
            case 2:
                if(unit <= 100){
                   ammount = unit*10;
                   System.out.println("Your Payment Ammount is : " + ammount);
                }
                else if(unit <= 200){
                   ammount = unit*20; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                else if(unit <= 300){
                   ammount = unit*30; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                else if(unit <= 400){
                   ammount = unit*40; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                else if(unit <= 500){
                   ammount = unit*50; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                else if(unit > 500){
                   ammount = unit*60; 
                    System.out.println("Your Payment Ammount is : " + ammount);
                }
                break;
        }
        
        System.out.println("Pay the bill in billing counter");
        System.out.println("THANK");
    }
}