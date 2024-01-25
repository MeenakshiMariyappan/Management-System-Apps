package TaxCalculationApp;

public class TaxCalculationApp {
	public static void main(String[] args) {
		// Accept employee information from the user
		System.out.println("Enter Employee Information:");
		Employee employee = Employee.getEmployeeFromUserInput();

		// Print income tax
		System.out.println("\nEmployee Information:");
		System.out.println("Employee ID: " + employee.getEmpId());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee Salary: $" + employee.getSalary());
		System.out.println("Income Tax: $" + employee.calculateTax());

		System.out.println();

		// Accept product information from the user
		System.out.println("Enter Product Information:");
		Product product = Product.getProductFromUserInput();

		// Print sales tax
		System.out.println("\nProduct Information:");
		System.out.println("Product ID: " + product.getPid());
		System.out.println("Unit Price: $" + product.getPrice());
		System.out.println("Quantity: " + product.getQuantity());
		System.out.println("Sales Tax: $" + product.calculateTax());
	}
}
