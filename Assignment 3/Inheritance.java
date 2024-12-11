/* Design and develop inheritance for a given case study, identify objects and relationships and
implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address, Mail_id,
and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project
Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the
inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff
club fund. Generate pay slips for the employees with their gross and net salary.*/

import java.util.Scanner;

public class SimplePaySlipGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("Enter employee type (Programmer, TeamLead, AssistantProjectManager, ProjectManager):");
        String type = scanner.nextLine().trim();

        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine().trim();

        System.out.println("Enter Employee ID:");
        String id = scanner.nextLine().trim();

        System.out.println("Enter Address:");
        String address = scanner.nextLine().trim();

        System.out.println("Enter Mail ID:");
        String mailId = scanner.nextLine().trim();

        System.out.println("Enter Mobile Number:");
        String mobileNo = scanner.nextLine().trim();

        System.out.println("Enter Basic Pay:");
        double basicPay = scanner.nextDouble();

        // Initialize variables
        double da, hra, pf, staffClubFund, grossSalary, netSalary;

        // Calculate allowances and salaries based on employee type
        switch (type.toLowerCase()) {
            case "programmer":
            case "teamlead":
            case "assistantprojectmanager":
            case "projectmanager":
                // Calculate allowances
                da = 0.97 * basicPay;
                hra = 0.10 * basicPay;
                pf = 0.12 * basicPay;
                staffClubFund = 0.001 * basicPay;

                // Calculate gross and net salary
                grossSalary = basicPay + da + hra;
                netSalary = grossSalary - pf - staffClubFund;

                // Output pay slip
                System.out.println("\nEmployee Name: " + name);
                System.out.println("Employee ID: " + id);
                System.out.println("Basic Pay: " + basicPay);
                System.out.println("DA: " + da);
                System.out.println("HRA: " + hra);
                System.out.println("PF: " + pf);
                System.out.println("Staff Club Fund: " + staffClubFund);
                System.out.println("Gross Salary: " + grossSalary);
                System.out.println("Net Salary: " + netSalary);
                break;

            default:
                System.out.println("Invalid employee type.");
                break;
        }

        scanner.close();
    }
}


//=========================================================================================
//Output
/*
Employee Name: prathmesh
Employee ID: 998877
Basic Pay: 100000.0
DA: 97000.0
HRA: 10000.0
PF: 12000.0
Staff Club Fund: 100.0
Gross Salary: 207000.0
Net Salary: 194900.0

=== Code Execution Successful ===
*/


