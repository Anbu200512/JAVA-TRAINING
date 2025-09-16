import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Helper.printInstructions();

        int numberOfEmployees = 4;
        AttendanceEmployee[] employees = new AttendanceEmployee[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Enter Name: ");
            String name = scanner.next();

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter Department: ");
            String department = scanner.next();

            employees[i] = new AttendanceEmployee(name, id, department);

            int[] tempAttendance = new int[7];
            employees[i].markAttendance(tempAttendance);
        }

        System.out.println("---------------------------------------------");

        for (AttendanceEmployee emp : employees) {
            emp.showDetails();
            emp.displayAttendance();
            System.out.println();
        }

        System.out.println("---------------------------------------------");
        
        Employee.showEmployeeCount();
    }
}
