package oops;

import java.util.Scanner;

interface Utilities{
    public void getDetails();
    public void setDetails();

}



public class Main {
    static void main_menu(){
        System.out.println("=========================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM **======================");
        System.out.println();
        System.out.println("============================= *** ENTER YOUR CHOICE *** ===========================");
        System.out.println();
        System.out.println("1).ADD SHOWROOMS \t\t\t 2).ADD EMPLOYEES \t\t\t 3).ADD CARS");
        System.out.println();
        System.out.println("4).GET SHOWROOMS \t\t\t 5).GET EMPLOYEES \t\t\t 6).GET CARS");
        System.out.println();
        System.out.println("========================== *** ENTER 0 TO EXIT! ***=========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];
        Car car[] = new Car[5];
        int car_counter = 0;
        int employee_counter = 0;
        int showroom_counter = 0;
        int choice = 100;
        while(choice !=0){
            main_menu();
            System.out.print("Enter your choice here: ");
            choice = sc.nextInt();

            while (choice != 9 && choice != 0){
                switch (choice){
                    case 1:
                        showroom [showroom_counter] = new Showroom();
                        showroom[showroom_counter].setDetails();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1) ADD NEW SHOWROOM");
                        System.out.println("2) GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 2:
                }
            }
        }




    }
}