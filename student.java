class STUDENT {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    // Default constructor
    STUDENT() {
        sname = "Default Student";
        marks_array = new int[]{};
        total = 0;
        avg = 0.0;
    }

    // Parameterized constructor
    STUDENT(String name, int[] marks) {
        sname = name;
        marks_array = marks;
        compute();
    }

    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
    }

    void display() {
        System.out.println("Student Name: " + sname);
        System.out.print("Marks Array: ");
        for (int mark : marks_array) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        STUDENT defaultStudent = new STUDENT();
        System.out.println("Default Student:");
        defaultStudent.display();
        System.out.println();

        // Using parameterized constructor
        String name = "Bob";
        int[] marks = {78, 92, 85, 88, 70};
        STUDENT parameterizedStudent = new STUDENT(name, marks);
        System.out.println("Parameterized Student:");
        parameterizedStudent.display();
    }
}
