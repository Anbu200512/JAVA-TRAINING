public class Exception1{
    public static void main(String[] args) {
        try{
            int[] number = {1,2,3};
            // int b = 10/0;
            // int a = number[3];
        }
        // catch(ArithmeticException e){
        //     System.out.println("cannot devided by 0");
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array index is out of bound");
        // }
        catch(Exception e){
            System.out.println("General error" + e.getMessage());
        }
        finally{
            System.out.println("final block runs here");
        }
        System.out.println("out of try - catch block");

    }

}