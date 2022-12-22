package com.bridgelabz.regex;
/*
 * Problem Statement: UC4 As a User need to follow pre-defined Mobile Format 
 * - E.g. 91 9919819801 - Country code follow by space and 10 digit number
 */
import java.util.Scanner;

public class UserRegistration {
	static Scanner scanner = new Scanner(System.in);

	// method for check first name
	public static void checkUserFirstName() {
		System.out.print("Enter a First Name:");
		String firstName = scanner.next();
		UserDetailsValidation.isValidFirstName(firstName);
	}
	// method for check last name
	public static void checkUserlastName() {
		System.out.print("Enter a Last Name: ");
		String lastName = scanner.next();
		UserDetailsValidation.isValidLastName(lastName);
	}
	// method for check email
	public static void checkEmail() {
		System.out.print("Enter an email: ");
		String email = scanner.next();
		UserDetailsValidation.isValidEmail(email);
	}
	//method for check mobile number
	public static void checkmobileNumber() {
	    System.out.print("Enter a Mobile Number: ");
	    scanner.nextLine();
	    String mobileNumber = scanner.nextLine();
	    UserDetailsValidation.isValidMobileNumber(mobileNumber);
	  }

	/*
	 * main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome To UserRegistration Problem.");
		// methods calling
		checkUserFirstName();
		checkUserlastName();
		checkEmail();
		checkmobileNumber();
	}
}
