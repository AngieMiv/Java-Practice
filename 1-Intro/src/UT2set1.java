import java.util.Scanner;

public class UT2set1 {

	/**
	 * 220 Design three functions that return: a) The maximum value stored in an
	 * integer array. b) The minimum value stored in an integer array. c) The
	 * arithmetic mean of the values stored in the array.
	 */
	public static int findMax(int[] arrayInts) {
		int max = arrayInts[0];
		for (int i = 1; i < arrayInts.length; i++) {
			if (arrayInts[i] > max) {
				max = arrayInts[i];
			}
		}
		System.out.println(max);
		return max;
	}

	public static int findMin(int[] arrayInts) {
		int min = arrayInts[0];
		for (int i = 1; i < arrayInts.length; i++) {
			if (arrayInts[i] < min) {
				min = arrayInts[i];
			}
		}
		System.out.println(min);
		return min;
	}

	public static double calcAvg(int[] arrayInts) {
		double avg = arrayInts[0];
		int sum = arrayInts[0];

		for (int i = 1; i < arrayInts.length; i++) {
			sum += arrayInts[i];
		}

		avg = (double) sum / arrayInts.length;
		System.out.println(avg);

		return avg;
	}

	/**
	 * 221 Design a function that generates a random number and, based on its value,
	 * returns a character according to the following rule: a) If the number is
	 * between 0 and 0.7, return '1'. b) If the number is between 0.7 and 0.9,
	 * return 'X'. c) If the number is greater than 0.9, return '2'.
	 * 
	 * @return result
	 */ 
	public static char getRandomQuinielaResult() {
		double randomValue = Math.random();
		char result;
		if (randomValue <= 0.7) {
			result = '1';
		} else if (randomValue <= 0.9) {
			result = 'X';
		} else {
			result = '2';
		}
		// System.out.println(result);
		return result;
	}

	/**
	 * 222 Design two functions that accept an integer array as a parameter and: a)
	 * Display the values of the array, separated by the symbol ';'. b) Increment
	 * each value in the array by 1 and display the updated values.
	 */
	public static void values(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			if (i != intArray.length - 1) {
				System.out.print(intArray[i] + "; ");
			} else {
				System.out.print(intArray[i]);
			}
		}
	}

	public static int[] incrementValues(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = intArray[i] + 1;
		}
		for (int i = 0; i < intArray.length; i++) {
			if (i != intArray.length - 1) {
				System.out.print(intArray[i] + "; ");
			} else {
				System.out.print(intArray[i]);
			}
		}
		return intArray;
	}

	/** 223 Given an integer array, display only the even values on the screen. */
	public static void evens(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 == 0) {
				if (i < intArray.length - 1) {
					System.out.print(intArray[i] + "; ");
				} else
					System.out.print(intArray[i]);
			}
		}
	}

	/**
	 * 224 Ask the user for a string and reverse the order of the words it contains.
	 * Display the result on the screen.
	 */
	public static String reversedStr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Say something");
		String str = sc.nextLine();

		String result = "";
		int lastSeparatorPosition = str.length();

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			if (c == ' ') {
				result += str.substring(i + 1, lastSeparatorPosition) + ' ';
				lastSeparatorPosition = i;
			} else if (i == 0) {
				result += str.substring(i, lastSeparatorPosition);
			}
		}

		System.out.println(result);
		sc.close();
		return result;

	}

	public static String reversedSplitStr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("say smth");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String result = "";
		for (int i = words.length - 1; i >= 0; i--) {
			result += words[i];
			if (i != 0) {
				result += ' ';
			}
		}
		System.out.println(result);
		sc.close();
		return result;
	}

	/**
	 * 225 Control digit in Spanish DNI: The algorithm to calculate the control
	 * letter is as follows: The number is divided by 23, and the remainder is used
	 * to determine a letter by inspecting the following table:
	 *
	 * <pre>
	 * REMAINDER:  0  1  2  3  4  5  6  7  8  9  10 11
	 * LETTER:     T  R  W  A  G  M  Y  F  P  D  X  B
	 *
	 * REMAINDER:  12 13 14 15 16 17 18 19 20 21 22
	 * LETTER:     N  J  Z  S  Q  V  H  L  C  K  E
	 * </pre>
	 *
	 * For example, if the DNI number is 12345678, dividing it by 23 gives a
	 * remainder of 14. Therefore, the letter is 'Z', resulting in: 12345678Z.
	 */
	public static void controlDigitDNI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's the DNI number?");
		int dni = sc.nextInt();
		int dniLength = String.valueOf(dni).length();

		while (dniLength != 8) {
			System.out.println("The number has to be 8 digits long. Enter the number again.");
			dni = sc.nextInt();
		}
		char letter = 1;
		int reminder = dni % 23;
		switch (reminder) {
		case 0:
			letter = 'T';
			break;
		case 1:
			letter = 'R';
			break;
		case 2:
			letter = 'W';
			break;
		case 3:
			letter = 'A';
			break;
		case 4:
			letter = 'G';
			break;
		case 5:
			letter = 'M';
			break;
		case 6:
			letter = 'Y';
			break;
		case 7:
			letter = 'F';
			break;
		case 8:
			letter = 'P';
			break;
		case 9:
			letter = 'D';
			break;
		case 10:
			letter = 'X';
			break;
		case 11:
			letter = 'B';
			break;
		case 12:
			letter = 'N';
			break;
		case 13:
			letter = 'J';
			break;
		case 14:
			letter = 'Z';
			break;
		case 15:
			letter = 'S';
			break;
		case 16:
			letter = 'Q';
			break;
		case 17:
			letter = 'V';
			break;
		case 18:
			letter = 'H';
			break;
		case 19:
			letter = 'L';
			break;
		case 20:
			letter = 'C';
			break;
		case 21:
			letter = 'K';
			break;
		case 22:
			letter = 'E';
			break;
		} // end switch/case
		
		sc.close();
		System.out.println(letter);
		
	} // end char controlDigitDNI - switch/case method - with Scanner

	public static char dniControlLetter(int dni) {
		char[] dniLetters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 
				'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	    while (String.valueOf(dni).length() != 8) {
	        System.out.println("The number has to be 8 digits long. Enter a valid DNI number.");
	    }
	    
	    int remainder = dni % 23;
	    System.out.println(dniLetters[remainder]);
	    return dniLetters[remainder];

	} // end char dniControlLetter - using string of chars - without Scanner
	
	/**
	 * 226 Automatic Match Forecast Generator.
	 *
	 * Create a program that generates a match result forecast automatically.
	 * The result must be displayed on screen in the following format:
	 *
	 * Match   Result
	 * 1       [1,X,2]
	 * ...
	 * 15      [1,X,2]
	 *
	 * Use the function you designed in exercise 221 to generate the result.
	 */
	public static void automaticMatchForecast() {
	    System.out.println("Match\tResult");
	    for (int i = 1; i <= 15; i++) {
	        char resultOne = getRandomQuinielaResult();
	        char resultTwo = getRandomQuinielaResult();
	        char resultThree = getRandomQuinielaResult();
	        System.out.println(i + "\t[" + resultOne + ", " + resultTwo + ", " + resultThree + "]");
	    }
	} // end automaticMatchForecast
	
	/**
	 * 228 Binary-Decimal Converter
	 * This program allows conversion between binary and decimal numbers.
	 * 
	 * Steps:
	 * 1. Define a binary number using a String array and display its decimal value using a conversion function.
	 * 2. Read a binary number as a String from keyboard input and convert it using the same function.
	 * 3. Add another function to convert a decimal number into its binary representation.
	 * 4. Implement a simple menu:
	 *    1 - Convert binary to decimal
	 *    2 - Convert decimal to binary
	 *    0 - Exit the program
	 */
	
	


}
