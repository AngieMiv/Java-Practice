import java.util.Scanner;

public class UT2set0 {

	/** 201 Determine the type of triangle by requesting the 3 sides: a, b, c.
	 * Equilateral Triangle: All three sides are equal.
	 * Right Triangle: 𝑎2 + 𝑏2 = 𝑐2 (you must check all three combinations).
	 * Isosceles Triangle: Two sides are equal (all cases must be checked).
	 * If none of the above conditions are met, print "Scalene Triangle".
	 */
	public static void typeOfTriangle() {
		Scanner sc = new Scanner(System.in);
		// loop for entering the sides to avoid repetition
		int[] sides = new int[3];
		char[] labels = {'a', 'b', 'c'};
		System.out.println("Enter the length of each side: a, b and c. ");
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter side " + labels[i] + ":");
			sides[i] = sc.nextInt();
		}
		int a = sides[0], b = sides[1], c = sides[2];

		if (a * a + b * b == c * c || 
	            b * b + c * c == a * a || 
	            a * a + c * c == b * b) {
	            System.out.println("The triangle is Right-Angled");
		} else if (a == b && a == c) {
	           System.out.println("The triangle is Equilateral");
		} else if (a == b || b == c || a == c) {
            System.out.println("The triangle is Isosceles"); 
		} else {
			System.out.println("The triangle is Scalene");
		}
		sc.close();
	}

	/** 202 The principal of a school is organizing a field trip and needs to determine
	 * how much to charge each student and how much to pay the travel company for the service.
	 * The way to charge is as follows:
	 *  + If there are 100 students or more, the cost per student is 65 euros;
	 *  + From 50 to 99 students, the cost is 70 euros;
	 *  + From 30 to 49 students, the cost is 95 euros;
	 *  + If there are less than 30 students, the cost of the bus rental is 4000 euros, regardless of the number of students.
	 *  Create an algorithm that determines the payment to the bus company and the amount each student must pay for the trip.
	 * */
	public static void schoolTrip() {
		Scanner sc = new Scanner(System.in);

		int nStudents;
		int busRental;
		double eachStudentAmount;
		
		System.out.println("How many students will go to the field trip?");
		nStudents = sc.nextInt();
		
		if (nStudents >= 100) {
			busRental = nStudents * 65;
		} else if (nStudents >= 50) {
			busRental = nStudents * 70;
		} else if (nStudents >= 30) {
			busRental = nStudents * 95;
		} else {
			busRental = 4000;
		} // endif busRental calc
		
		if (nStudents > 0) {
			eachStudentAmount = busRental / (double) nStudents;
			System.out.println("The payment to the bus company is " + busRental + "€, "
					+ "and the amount each student must pay is " + eachStudentAmount + "€.");
		} else {
			System.out.println("Invalid number of students.");
		}// endif syso
		
		sc.close();
		
	} // end schoolTrip()

} // end class UT2set0