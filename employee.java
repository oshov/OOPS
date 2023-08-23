import java.util.Scanner;

class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic;
    double DA;
    double GrossSal;
    double NetSal;

    // Default constructor
    EMPLOYEE() {
        Ename = "Default Employee";
        Eid = 0;
        Basic = 0.0;
        DA = 0.0;
    }

    // Parameterized constructor
    EMPLOYEE(String name, int id, double basic, double da) {
        Ename = name;
        Eid = id;
        Basic = basic;
        DA = da;
        compute_net_sal();
    }

    void compute_net_sal() {
        GrossSal = Basic + DA;
        NetSal = GrossSal - (0.1 * GrossSal); // Assuming 10% deduction for simplicity
    }

    void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + GrossSal);
        System.out.println("Net Salary: " + NetSal);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Using default constructor
        EMPLOYEE defaultEmployee = new EMPLOYEE();
        System.out.println("Default Employee:");
        defaultEmployee.display();
        
        // Using parameterized constructor
        System.out.print("\nEnter Employee Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        
        System.out.print("Enter Basic Salary: ");
        double basic = scanner.nextDouble();
        
        System.out.print("Enter DA: ");
        double da = scanner.nextDouble();
        
        EMPLOYEE parameterizedEmployee = new EMPLOYEE(name, id, basic, da);
        System.out.println("\nParameterized Employee:");
        parameterizedEmployee.display();
    }
}
