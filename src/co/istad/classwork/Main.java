package co.istad.classwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaffManager mange = new StaffManager();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\n===== Staff Management System =====");
            System.out.println("1. List Staff");
            System.out.println("2. Search Staff (ID, Name, Gender, Position)");
            System.out.println("3. Add new Staff");
            System.out.println("4. Update Staff by ID");
            System.out.println("5. Delete Staff by ID");
            System.out.println("0. Exit application");
            System.out.print("Enter your choice: ");
            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Invalid input! Enter a number.");
                continue;
            }
            switch (option){
                case 1 -> mange.renderStaff();
//                case 2 -> ;
                case 3 -> mange.addStaff();
//                case 4 ->;
//                case 5 ->
                case 0 -> {
                    System.out.println("👋 Exiting application...");
                    return;
                }
                default -> System.out.println("Invalid Option!!!");
            }

        }
    }
}
