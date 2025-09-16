public class AddString{
    public static void main(String []args){
        String s1 = "124";
        String s2 = "456";

        for(int i = 0 ; i<s1.length();i++){
           int a = s1.charAt(i) - '0';
           int b = s2.charAt(i) - '0';
            System.out.print(a+b);
        }
    }
}