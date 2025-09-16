import java.util.Scanner;
public class Atm{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert your Card");
        System.out.println("if yes enter 1 , else 2");
        int card = scan.nextInt();
        int balance = 10000;
        int dpin = 4513;
        int count=0; 
        // int c=0;
        Boolean c = false;
        if(card==1){
            while(count<=1){
                System.out.println("Enter your Pin number");
                int pin = scan.nextInt();
                 c=true;
                 
                if(pin==dpin){
                  System.out.println("whithdraw - 1 / deposit - 2 / Check balance - 3 / Pin change - 4 ");
                  int method = scan.nextInt();
                  switch (method){
                      case 1:
                          System.out.println("Enter the Ammount ");
                          int Wammount = scan.nextInt();
                          if(balance >= Wammount){
                              balance = balance - Wammount;
                              System.out.println("collect your cash ");
                              System.out.println("Your balance :  "+ balance);
                             
                          }
                          else{
                              System.out.println("You don't have enough Money ");
                          }
                          break;
                     case 2:
                         System.out.println("Enter the Ammount ");
                         int Dammount = scan.nextInt();
                         balance = balance + Dammount;
                         System.out.println("Deposited");
                        System.out.println("Your balance :  "+ balance);
                        break;
                    case 3:
                        System.out.println("Your balance is  :  "+ balance);
                        break;
                    case 4:
                        System.out.println("Enter your new pin ");
                        pin = scan.nextInt();
                        System.out.println("pin changed");
                        break;
                   }
                  
                  break;
                  
                } 
                else{
                    
                    System.out.println("Enter your Pin number");
                    pin = scan.nextInt();
                    count++;
                    

                } 
            }  
        }
        

    }
}