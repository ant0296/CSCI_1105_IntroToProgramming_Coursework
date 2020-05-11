//Anthony Catalano, 5/11, assignment 6-3, testing whether a given value is a palindrome.
//First thing, import scanner
import java.util.Scanner;
	class PalindromeTester {
		public static void main(String[] args) {
			//Set up the scanner, and define the variable that will hold the value.
			Scanner input = new Scanner(System.in);
				int a = 0;
				System.out.println ("Provide a whole number, and I will tell you if it's a palindrome: ");
				a = input.nextInt();
				boolean palindrome = isPalindrome(a);
				System.out.println ("Is " + a + " a palindrome? The answer is " + palindrome + ".");
		}	
			//Run the first method, importing the variable provided.
		public static boolean isPalindrome(int a) {
			int b = 0;
			boolean c = false;
			b = reverse(a);
			if (c = (a == b)) {
			return c;
			}
			else return c;
		}
			//Run the second method from within the first, again importing the variable to be used.
		public static int reverse(int a) {
			int temp = a;
			int placeMover = 0;
			int aReversed = 0;
			while (temp > 0) {
				placeMover = temp % 10;
				aReversed = aReversed * 10 + placeMover;
				temp /= 10;
			}
			return aReversed;
		}
}