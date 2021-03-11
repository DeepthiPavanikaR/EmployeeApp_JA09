package com.capg.empapp.main;

import java.util.Scanner;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.service.EmployeeServiceImpl;
import com.capg.empapp.service.IEmployeeService;

public class EmpMainClass {

	IEmployeeService empService = new EmployeeServiceImpl();

	public static void main(String[] args) {

		EmpMainClass app = new EmpMainClass();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(" === MENU ==== ");
			System.out.println("1. add employee ");
			System.out.println("2. Display All Employee ");
			System.out.println("3. Edit Employee Salary ");
			System.out.println("4. Edit Employee Experience");
			System.out.println("5. Display Employee based on Experience");
			System.out.println("6. Display Employee based on salary");
			System.out.println("7. Display Employee based on salary range ");

			System.out.println("0. EXIT");
			System.out.println("Enter Option");
			int option = Integer.parseInt(sc.nextLine());
			switch (option) {

			case 1:

				System.out.println("Enter Employee Id ");
				int empId = Integer.parseInt(sc.nextLine());

				System.out.println("Enter Employee Salary ");
				double empSalary = Integer.parseInt(sc.nextLine());

				System.out.println("Enter Employee Exp ");
				int empExp = Integer.parseInt(sc.nextLine());

				System.out.println("Enter Employee Name ");
				String name = sc.nextLine();

				Employee e = new Employee(empId, name, empExp, empSalary);

				try {
					boolean isInserted = app.empService.addEmployee(e);
					if (isInserted) {
						System.out.println(" Employee Added !!!");
					} else {
						throw new Exception("Cannot added Employee ...");
					}
				} catch (Exception ex) {
					System.out.println(" Contact to Customer Care ... " + ex); // raise the exception
				}

				break;
			case 2:

				Employee arr[] = app.empService.getAllEmployees();
				int count = EmployeeDB.count; // not the code
				System.out.println("  --->>  count in main " + count);
				for (int i = 0; i < count; i++) {
					System.out.println(arr[i]);
					System.out.println(" ========================================================");
				}
				break;

			case 3:

				System.out.println("Enter Employee Id ");
				int editEmpId = Integer.parseInt(sc.nextLine());
				System.out.println("Enter new Employee Salary ");
				double editEmpSalary = Integer.parseInt(sc.nextLine());

				try {
					boolean isEdited = app.empService.editSalaryByEmployeeId(editEmpId, editEmpSalary);
					if (isEdited) {
						System.out.println(" Salary edited !!!");
					} else {
						throw new Exception("Id not found...");
					}
				} catch (Exception ex) {
					System.out.println(" Contact to Customer Care ... " + ex); // raise the exception
				}
				break;

			case 4:

				System.out.println("Enter Employee Id ");
				int edEmpId = Integer.parseInt(sc.nextLine());
				System.out.println("Enter new Employee Experience ");
				int editEmpExp = Integer.parseInt(sc.nextLine());

				try {
					boolean isEdited = app.empService.editExpByEmployeeId(edEmpId, editEmpExp);
					if (isEdited) {
						System.out.println(" Experience edited !!!");
					} else {
						throw new Exception("Id not found...");
					}
				} catch (Exception ex) {
					System.out.println(" Contact to Customer Care ... " + ex); // raise the exception
				}
				break;

			case 5:
				System.out.println("Enter the experience ");
				int exp1 = Integer.parseInt(sc.nextLine());
				app.empService.getEmployeeByExperience(exp1);
				break;
				
			case 6:
				System.out.println("Enter the Salary ");
				double salary = Integer.parseInt(sc.nextLine());
				app.empService.getEmployeeBySalary(salary);
				break;

			case 7:
				System.out.println("Enter minimun and maximum  Salary ");
				double minSalary = Integer.parseInt(sc.nextLine());
				double maxSalary = Integer.parseInt(sc.nextLine());
				app.empService.getEmployessBySalaryRange(minSalary, maxSalary);
				break;

			case 0:
				System.exit(0);

			}// end switch

		} // end while

	}// end main

}// end class