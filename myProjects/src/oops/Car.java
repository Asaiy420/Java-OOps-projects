package oops;

import java.util.Scanner;

public class Car extends Showroom implements Utilities{
    String car_name;
    String car_color;
    String car_fuel;
    int car_price;
    String car_type;
    String car_transmission;


    @Override
    public void getDetails() {
        System.out.println("Car Name: "+car_name);
        System.out.println("Car Color: "+car_color);
        System.out.println("Fuel Type: "+car_fuel);
        System.out.println("Car Price: "+car_price);
        System.out.println("Car Type: "+car_type);
        System.out.println("Car Transmission: "+car_transmission);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== *** ENTER CAR DETAILS *** ============================");
        System.out.println();
        System.out.println("Enter Car Name: ");
        car_name = sc.nextLine();
        System.out.println("Enter Car Color: ");
        car_color = sc.nextLine();
        System.out.println("Enter Fuel Type (Petrol/Diesel/Electric): ");
        car_fuel = sc.nextLine();
        System.out.println("Enter Car Price: ");
        car_price = sc.nextInt();
        System.out.println("Enter Car Type (Sedan,SUV,JEEP): ");
        car_type = sc.nextLine();
        System.out.println("Enter Car Transmission(Automatic/Manual): ");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;

    }
}