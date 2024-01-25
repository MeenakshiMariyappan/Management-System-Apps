package TaxCalculationApp;

import java.util.Scanner;

public class Employee implements Taxable {
	private int empId;
	private String name;
	private double salary;

	// Constructor
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// Implementing the calculateTax method from the Taxable interface
	@Override
	public double calculateTax() {
		return salary * incomeTax;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public static Employee getEmployeeFromUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		int empId = scanner.nextInt();
		scanner.nextLine(); 
		System.out.print("Enter Employee Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Employee Salary: $");
		double salary = scanner.nextDouble();
		return new Employee(empId, name, salary);
	}
}
