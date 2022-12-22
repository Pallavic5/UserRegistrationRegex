package com.bridgelabz.regex;
/*
 * Problem Statement : As a User need to enter a valid First Name
 * - First name starts with Cap and has minimum 3 characters
 */
import java.util.Scanner;

public class UserRegistration {
	static Scanner scanner = new Scanner(System.in);
	public static void checkUserFirstName() {
		System.out.println("Enter a First Name:");
		String firstName = scanner.next();
		UserDetailsValidation.isValidFirstName(firstName);
	}
		/*
		 * main method
		 */
	public static void main(String[] args) {
		System.out.println("Welcome To UserRegistration Problem.");
		checkUserFirstName();
		scanner.close();
	}

}
