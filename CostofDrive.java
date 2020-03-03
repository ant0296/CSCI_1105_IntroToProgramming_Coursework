	//Anthony Catalano, 3/3, Exercise 2-23: Writing a program to display the cost of driving a distance
		import java.util.Scanner;
	//Import scanner

	class CostofDrive {
		public static void main(String[] args) {
			//Declare the variables used in the calculation
			Scanner input = new Scanner(System.in);
			double distance = 0.0;
			double mpg = 0.0;
			double gascost = 0.0;
			double totalcost = 0.0;
			//Acquire input
			System.out.print("How far will you be driving? ");
			distance = input.nextDouble();
			System.out.print("What is the miles per gallon of what you're driving? ");
			mpg = input.nextDouble();
			System.out.print("How much does a gallon of fuel cost? ");
			gascost = input.nextDouble();
			//Peform calculation
			totalcost = (distance / mpg) * gascost;
			//Display the output
			System.out.println("The cost of this trip will cost about " + "$" + totalcost + ".");
		}
}