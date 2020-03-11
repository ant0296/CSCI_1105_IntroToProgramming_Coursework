//Anthony Catalano, 3/11, Assignment 5-49: Determining length of string, and # of vowels & consonants in it
//import the scanner
import java.util.Scanner;

		class Charactersinstring {
			public static void main(String[] args) {
//Set up the scanner, define and set variables
			Scanner input = new Scanner(System.in);
				String word = "Blank";
				int wordLength = 0;
				int vowels = 0;
				int consonants = 0;
				int lengthCheck = 0;
				char charCheck = ' ';
				System.out.println ("What word shall I examine? ");
				word = input.next();
				wordLength = word.length();
//Initialize loop to check each letter
				while (lengthCheck < wordLength) {
					charCheck = word.charAt(lengthCheck);
					if ((charCheck == 'a') || (charCheck == 'A') || (charCheck == 'e') || (charCheck == 'E') || (charCheck == 'i') || (charCheck == 'I') || (charCheck == 'o') || (charCheck == 'O') || (charCheck == 'u') || (charCheck == 'U'))
						vowels++;
					else if (charCheck != ' ')
						consonants++;
					
					++lengthCheck;
				}
				System.out.println ("The word " + word + " is " + wordLength + " characters long, has " + vowels + " vowel(s) in it and " + consonants + " consonant(s) in it.");

	}
}