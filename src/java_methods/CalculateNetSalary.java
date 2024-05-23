package java_methods;

import java.util.Scanner;

public class CalculateNetSalary {


	// Class for Allowances
	public static class Allowances {
		double hra, ta, da, totalAllowance;

		public Allowances(double hra, double ta, double da) {
			this.hra = hra;
			this.ta = ta;
			this.da = da;
			this.totalAllowance = hra + ta + da;
		}
	}

	// class for Deductions
	public static class Deductions {
		double ma, pf, totalDeductions;

		public Deductions(double ma, double pf) {
			this.ma = ma;
			this.pf = pf;
			this.totalDeductions = ma + pf;
		}
	}

    // Method to calculate total allowance based on salary
	static Allowances totalAllowances(double salary) {
		
        // Calculate H.R.A., T.A., and D.A. based on provided percentages
		double hra = (45.0 / 100) * salary;
		double ta = (25.0 / 100) * salary;
		double da = (30.0 / 100) * salary;

        // Create an instance of Allowances with calculated values
		return new Allowances(hra, ta, da);
	}

    // Method to calculate total deductions based on salary
	static Deductions totalDeductions(double salary) {
		
        // Calculate M.A. and P.F. based on provided percentages
		double ma = (5.0 / 100) * salary;
		double pf = (25.0 / 100) * salary;
		  
        // Create an instance of Deductions with calculated values
		return new Deductions(ma, pf);
	}

	
    // Method to calculate net salary based on allowances and deductions
	static double netSalary(Allowances salaryAllowance, Deductions salaryDeductions, double salary) {

		// Calculate total salary by adding basic salary, total allowances, and deducting total deductions
		double totalSalary = salary + salaryAllowance.totalAllowance - salaryDeductions.totalDeductions;
		return totalSalary;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee's Basic Salary : ");
		double salary = scan.nextDouble();

		// Calculate allowances and deductions
		Allowances salaryAllowance = totalAllowances(salary);
		Deductions salaryDeductions = totalDeductions(salary);

		// Calculate and display the net salary
        double netSalary = netSalary(salaryAllowance, salaryDeductions, salary);
        System.out.println("In Hand Salary is : " + netSalary);

		scan.close();
	}
}

/*
 * Why to make inner class as public static ?
 * 
 * Making the inner class `public` and `static` depends on whether you intend to
 * use the inner class outside of the `CalculateNetSalary` class and whether it
 * needs to be accessed independently of an instance of the outer class. Let me
 * explain the implications of making it `public` and `static`:
 * 
 * 1. **Public Inner Class**: - When you declare the inner class as `public`, it
 * can be accessed from outside the `CalculateNetSalary` class using
 * `CalculateNetSalary.Allowances`. - If you have other classes or components
 * that need to use this `Allowances` class independently, it makes sense to
 * declare it as `public`.
 * 
 * 2. **Static Inner Class**: - A `static` inner class does not require an
 * instance of the outer class to be created before you can create an instance
 * of the inner class. This allows you to use it in a more stand alone manner. -
 * If the `Allowances` class doesn't need to access any instance-specific data
 * or methods from the outer class, it can be made `static`. This is a good
 * practice if the inner class doesn't have any reliance on the outer class's
 * state.
 * 
 * If you intend to use the `Allowances` class only within the context of the
 * `CalculateNetSalary` class and it doesn't need to be accessed independently
 * from outside, you can make it a non-public inner class by simply declaring it
 * as `class Allowances { ... }`. This restricts its visibility to only within
 * the `CalculateNetSalary` class.
 * 
 * 
 */





