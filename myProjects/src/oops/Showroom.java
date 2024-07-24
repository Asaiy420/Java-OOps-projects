package oops;

import java.util.Scanner;

public class Showroom implements Utilities{
String showroom_name;
String showroom_address;
int total_employees;
int total_cars_in_stock = 0;
String manager_name;


    @Override
    public void getDetails() {
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+ showroom_address);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Cars in Stocks: "+total_cars_in_stock);
        System.out.println("Manager Name: "+manager_name);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== *** ENTER SHOWROOM DETAILS *** ============================");
        System.out.println();

        //We take user inputs here
        System.out.println("Enter Showroom Name: ");
        showroom_name = sc.nextLine();
        System.out.println("Enter Showroom Address: ");
        showroom_address = sc.nextLine();
        System.out.println("Enter Manager Name: ");
        manager_name = sc.nextLine();
        System.out.println("Enter Total Number of Employees: ");
        total_employees = sc.nextInt();
        System.out.println("Enter the amount of cars in stock: ");
        total_cars_in_stock = sc.nextInt();


    }
}
