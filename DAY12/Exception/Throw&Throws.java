public class Throw&Throws{
    public static void main(String[] args) {
       try{
        checkEven(7);
       }
       catch(IllegalAccessException e){
        System.out.println("Caught Exception" + e.getMessage());
        }    
    }
    
}
