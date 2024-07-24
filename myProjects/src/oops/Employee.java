package oops;

import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements Utilities{
    //we make employees variables here

    int emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void getDetails() {
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_name);
        System.out.println("Department: "+emp_department);
        System.out.println("Showroom Name: "+showroom_name);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        System.out.println("====================== *** ENTER EMPLOYEE DETAILS *** ============================");
        System.out.println();

        //we set details input here
        System.out.println("Enter Employee ID: ");
        emp_id = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        emp_name = sc.nextLine();
        System.out.println("Enter Department: ");
        emp_department = sc.nextLine();
        System.out.println("Enter Showroom Name: ");
        showroom_name = sc.nextLine();
    }
}