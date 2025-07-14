package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		this.grossSalary += (this.grossSalary * percentage) / 100.00;
	}
	public String employeeData() {
		return "Employee: " + name + ", $ " + String.format("%.2f%n", netSalary());
	}
	public String employeeUpdatedData() {
		return "Updated data: "+ name + ", $ " + String.format("%.2f%n", netSalary());
	}
}
