import java.util.Scanner;
public class karprekar{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int num = scan.nextInt();
        long numsqr = num*num;
        String result = Long.toString(numsqr);

        if(kar(num,result)){
            System.out.println("karprekar number");
        }
        else{
             System.out.println(" not a karprekar number");
        }

    }

    public static boolean kar(int num, String result){
            for (int i = 1; i < result.length(); i++) {
                 String left = result.substring(0,i);
            String right = result.substring(i);

            int  leftnum = Integer.parseInt(left);
            int  rightnum = Integer.parseInt(right);

            if(leftnum + rightnum == num){
                return true;
            }
        }
        return false;
        }
}