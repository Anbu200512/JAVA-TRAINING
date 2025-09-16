public class vote{
    public static void main(String[] args) {
        try {
            checkvoter(16);
        } 
        catch (Exception e) {
            System.out.println("Caught Exception "+e.getMessage());
        }
    }

    private static void checkvoter(int i) throws Exception {
        if(i<18){
             throw new Exception("You are not elegible for voting");
        }
        else{
            System.out.println("You are elegible for voting");
        }
    }   
}