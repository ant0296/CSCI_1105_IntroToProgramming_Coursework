	//Anthony Catalano, 3/3, Exercise 2-13: Writing a program to calculate the value of an account, given a monthly saving amount
	import java.util.Scanner;
	//Import scanner

	class SavingsConverter {
		public static void main(String[] args) {
			//Declare the variables used in the calculation
			Scanner input = new Scanner(System.in);
			double deposit = 0.0;
			double annualinterestrate = 0.00417;
			double totalpool = 0.0;
			//Acquire input
			System.out.print("Enter your monthly saving amount " + "$");
			deposit = input.nextDouble();
			//Set a loop for the conversion
			int count = 0;
			while (count < 6){
				totalpool = (deposit + totalpool) * (1 + annualinterestrate);
				count++;
			}
			//Display the output
			System.out.println("After six months, your account will be worth " + "$" + totalpool);
		}
}