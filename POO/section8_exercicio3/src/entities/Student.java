package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	public double missingPoints() {
		return 60.0 - finalGrade();
	}
	public boolean isApproved() {
		return finalGrade() >= 60.0;
	}
	public String finalResult() {
		
		if (isApproved()) {
			return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) + "PASS";
		} 
		else {
			return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) 
				+ String.format("FAILED%n") 
				+ String.format("MISSING %.2f POINTS", missingPoints());
		}
	}
}
