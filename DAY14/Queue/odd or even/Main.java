public class Main {
    public static void main(String[] args) {
        int[] q1Arr = {1, 2, 3, 4 ,5 };
        int[] q2Arr = {8, 9, 8, 12, 6};

        int maxLen = Math.max(q1Arr.length, q2Arr.length);

        Oddeven q1 = new Oddeven(maxLen);
        Oddeven q2 = new Oddeven(maxLen);

        for (int val : q1Arr) q1.enqueue(val);
        for (int val : q2Arr) q2.enqueue(val);

        for (int i = 0; i < maxLen; i++) {
            int a = q1.dequeue();
            int b = q2.dequeue();
            if ( a + b == 11){
                System.out.print(a+","+b + "  ");
                
            }
            
        }
    }
}
