//Anthony Catalano, 3/9, Exercise 4-23: Calculating gross pay, tax withheld, and net pay 
	import java.util.Scanner;

	//Import the scanner

	class Payroll {
		public static void main(String[] args) {
			//Define our variables
			Scanner input = new Scanner(System.in);
			String Name = "Blank";
			double Hours = 0.0;
			double Rate = 0.0;
			double Gross = 0.0;
			double Fedtax = 0.0;
			double Statax = 0.0;
			double Deduct = 0.0;
			double Total = 0.0;
			//Ask for new values to populate variables
			System.out.println("What is your name? ");
			Name = input.next();
			System.out.println("How many hours have you worked this week? ");
			Hours = input.nextDouble();
			System.out.println("And how much is your hourly pay rate? ");
			Rate = input.nextDouble();
			System.out.println("Now, how much is the rate of federal tax in your area? In decimal form, please. ");
			Fedtax = input.nextDouble();
			System.out.println("And for state? ");
			Statax = input.nextDouble();
			//Perform the calculations
			Gross = Hours * Rate;
			Deduct = Gross * Fedtax;
			Deduct += Gross * Statax;
			//Round decimals in a bit of a workaround way
			Deduct = Math.ceil(Deduct * 100);
			Deduct = Deduct / 100;
			Total = Gross - Deduct;
			
			//Print the results
			System.out.println("For employee " + Name + ",");
			System.out.println("You've worked " + Hours + " hours at $" + Rate + " an hour, earning a total of $" + Gross + ".");
			System.out.println("With the federal tax rate of " + Fedtax * 100 + "% and state tax rate of " + Statax * 100 + "%, the total amount of deductions is $" + Deduct + ".");
			System.out.println("That would make your net pay $" + Total + ".");
					}
	}