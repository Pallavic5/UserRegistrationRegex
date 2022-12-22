package com.bridgelabz.regex;
/*
 * Problem Statement :UC2 As a User need to enter a valid Last Name 
 * - Last name starts with Cap and has minimum 3 characters
 * - 
 */
import java.util.Scanner;

public class UserRegistration {
	static Scanner scanner = new Scanner(System.in);
	//method for check first name
	public static void checkUserFirstName() {
		System.out.print("Enter a First Name:");
		String firstName = scanner.next();
		UserDetailsValidation.isValidFirstName(firstName);
	}
	//method for check last name
	public static void checkUserlastName() {
		System.out.print("Enter a Last Name: ");
	    String lastName = scanner.next();
	    UserDetailsValidation.isValidLastName(lastName);
	}
		/*
		 * main method
		 */
	public static void main(String[] args) {
		System.out.println("Welcome To UserRegistration Problem.");
		//methods calling
		checkUserFirstName();
		checkUserlastName();
	}
}
