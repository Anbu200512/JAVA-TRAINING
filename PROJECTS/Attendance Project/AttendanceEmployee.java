import java.util.Scanner;

class AttendanceEmployee extends Employee implements Markable {
    private int[] attendanceArray = new int[7];

    public AttendanceEmployee(String name, int id, String department) {
        super(name, id, department);
    }

    public void markAttendance(int[] attendanceArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Attendance (7 values of 0/1): ");
        for (int i = 0; i < 7; i++) {
            attendanceArray[i] = scanner.nextInt();
        }
        this.attendanceArray = attendanceArray;
    }

    public int calculatePresentDays(int[] attendanceArray) {
        int count = 0;
        for (int i = 0; i < attendanceArray.length; i++) {
          if (attendanceArray[i] == 1) count++;
        }
        return count;

    }

    public void displayAttendance() {
        System.out.print("Attendance: [");
        for (int i = 0; i < 7; i++) {
            System.out.print(attendanceArray[i]);
            if (i < 6) System.out.print(", ");
        }
        System.out.println("]");
        int presentDays = calculatePresentDays(attendanceArray);
        System.out.println("Total Present Days: " + presentDays);
    }
}
