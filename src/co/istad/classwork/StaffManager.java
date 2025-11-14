package co.istad.classwork;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffManager {
    private List<Staff> staffList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void renderStaff() {
        if (staffList.isEmpty()) {
            System.out.println("\nNo Staff available.\n");
            return;
        }

        Table table = new Table(6, BorderStyle.UNICODE_ROUND_BOX);

        table.addCell("ID");
        table.addCell("NAME");
        table.addCell("GENDER");
        table.addCell("POSITION");
        table.addCell("SALARY");
        table.addCell("STATUS");

        for (Staff staff : staffList) {
            table.addCell(staff.getId());
            table.addCell(staff.getName());
            table.addCell(staff.getGender());
            table.addCell(staff.getPosition());
            table.addCell(staff.getSalary().toString());
            table.addCell(String.valueOf(staff.isStatus()));
        }

        System.out.println("\n===== Student List =====");
        System.out.println(table.render());
    }
    public void addStaff(){
        try {
            System.out.print("Enter student ID: ");
            String id = input.nextLine();

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter gender: ");
            String gender = input.nextLine();

            System.out.print("Enter Position: ");
            String position = input.nextLine();

            System.out.print("Enter Salary: ");
            BigDecimal salary = input.nextBigDecimal();

            System.out.print("Enter Status: ");
            boolean isStaff = input.nextBoolean();

            staffList.add(new Staff(id , name , gender , position , salary , isStaff));

            System.out.println("✅ Student added successfully!");
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Invalid input! Try again.");
        }
    }
}
