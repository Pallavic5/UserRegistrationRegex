package com.bridgelabz.regex;

/*
 * Problem Statement :UC3 As a User need to enter a valid Email 
 * - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts 
 * (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
 * 
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

	/*
	 * main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome To UserRegistration Problem.");
		// methods calling
		checkUserFirstName();
		checkUserlastName();
		checkEmail();
	}
}
