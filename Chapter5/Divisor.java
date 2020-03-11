//Anthony Catalano, 3/11, Assignment 5-11: Displaying numbers between 100 & 200 divisible by either 5 or 6
class Divisor {
	public static void main(String[] args) {
		int value = 100;
		int printcount = 0;
		do {
			
			if (value % 5 == 0 ^ value % 6 == 0) {
				System.out.print(value + " ");
				printcount++;
			}
			value++;	
			if (printcount == 10) {
				System.out.print("\n");
				printcount = 0;
			}
		} while (value < 201);
	}
}
