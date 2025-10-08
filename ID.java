/*

Problem 4: name with ID

Barcinilla, John Paul: Did everything.
Tanchico, Hanz: Didn't attend the class, no response.

*/

import java.util.Scanner;

public class ID {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName, middleName, lastName;
		int studentID;
	
		System.out.print("Enter first name: ");
		firstName = scan.nextLine();
		System.out.print("Enter middle name: ");
		middleName = scan.nextLine();
		System.out.print("Enter last name: ");
		lastName = scan.nextLine();
		System.out.print("Enter student ID: " );
		studentID = scan.nextInt();
	
		System.out.println("\n===========================");
		System.out.println("ID: 1000" + studentID);
		System.out.printf("Full name: %s %s %s", firstName, middleName, lastName);
		System.out.println("\n===========================");
	}
}