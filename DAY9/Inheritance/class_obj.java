
class College {
    static int code = 1000;
    // Instance variables
    String collegeName;
    int collegeCode;
    
    // Constructor to initialize the college name and assign a unique code
    College(String collegeName) {
        this.collegeName = collegeName;
        this.collegeCode = code++;
    }

    // Method to display college details
    void display() {
        System.out.println("College Name: " + collegeName);
        System.out.println("College Code: " + collegeCode);
    }
}

// Main class that contains the main method
public class class_obj {
    public static void main(String[] args) {

        // Create first object of College class
        College c1 = new College("ABC College");

        // Create second object of College class
        College c2 = new College("XYZ College");

        // Call display method using both objects
        c1.display();
        c2.display();
    }
}

