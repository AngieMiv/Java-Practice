import java.util.Scanner;

public class UT2set1 {
	
	/** 220 Design three functions that return: 
	 * a) The maximum value stored in an integer array.
	 * b) The minimum value stored in an integer array.
	 * c) The arithmetic mean of the values stored in the array.
	 * */
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
		
		avg = (double)sum / arrayInts.length;
		System.out.println(avg);
		
		return avg;
	}
	
	/** 221 Design a function that generates a random number and, based on its value, 
	 *  returns a character according to the following rule:
	 *  a) If the number is between 0 and 0.7, return '1'.
	 *  b) If the number is between 0.7 and 0.9, return 'X'.
	 *  c) If the number is greater than 0.9, return '2'.
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
		System.out.println(result);
		return result;
	}
	
	
	
	
	/** 222 Design two functions that accept an integer array as a parameter and:
	 *  a) Display the values of the array, separated by the symbol ';'.
	 *  b) Increment each value in the array by 1 and display the updated values.
	 */
	
	
	/** 223 Given an integer array, display only the even values on the screen. */

	
	
	/** 224 Ask the user for a string and reverse the order of the words it contains. 
	 *  Display the result on the screen.
	 */
	
	

}
