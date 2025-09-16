import java util.java;
public class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to draw:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice1 = sc.nextInt();
        System.out.println("Choose any one :");
        System.out.println("1. Area");
        System.out.println("2. Perimete");
        System.out.print("Enter your choice (1/2): ");
        int choice2 = sc.nextInt();
        int l=10;
        int b=5;
        if(choice1==1){
            System.out.println("Enter a :");
            int a = sc.nextInt();
            if(choice2==1){
                 System.out.println("Area of Square is :"+ a*a);
            }
            else{
                 System.out.println("Area of Square is :"+ 4);
            }
            
        }
        else if(choice2==2){
            
        }
    }
    

}
