

public class Main{
    public static void main(String[] args) {
        Borrowed l1 = new Borrowed("java","sun","programing","Anbu","1/8/2025");
        Borrowed l2 = new Borrowed("Python","Moon","programing","Rasheed","1/10/2026");
        l1.Statement1();
        System.out.println("------------------");
        l1.BorrowedDisplay();
        System.out.println("------------------");
        l2.BorrowedDisplay();
        System.out.println("------------------");
        l2.Statement2();
    }
}