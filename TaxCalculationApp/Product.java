package TaxCalculationApp;

import java.util.Scanner;

public class Product implements Taxable {
	private int pid;
	private double price;
	private int quantity;

	// Constructor
	public Product(int pid, double price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	// Implementing the calculateTax method from the Taxable interface
	@Override
	public double calculateTax() {
		return price * salesTax * quantity;
	}

	public int getPid() {
		return pid;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public static Product getProductFromUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Product ID: ");
		int pid = scanner.nextInt();
		scanner.nextLine(); 
		System.out.print("Enter Unit Price: $");
		double price = scanner.nextDouble();
		System.out.print("Enter Quantity: ");
		int quantity = scanner.nextInt();
		return new Product(pid, price, quantity);
	}
}
