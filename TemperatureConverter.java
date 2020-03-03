		//Anthony Catalano, 3/2, Exercise 2-1: Writing a program that converts degrees in Celsius to Farenheit
		import java.util.Scanner;
		//Scanner imported

		class TemperatureConverter {
			public static void main(String[] args) {
				//Declare the variable for Celsius, setting the default to 0
				Scanner input = new Scanner(System.in);
				double degreescelsius = 0.0;
				double degreesfarenheit = 0.0;
				//Acquire input
				System.out.print("Enter a degree in Celsius ");
				degreescelsius = input.nextDouble();
				//Perform conversion and display output
				degreesfarenheit = degreescelsius * (9.0 / 5) + 32;
				System.out.println(degreescelsius + " degrees in Celsius equals " + degreesfarenheit + " degrees in Fahrenheit.");
			}
	}