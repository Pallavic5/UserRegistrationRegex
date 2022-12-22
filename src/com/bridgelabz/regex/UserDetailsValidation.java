package com.bridgelabz.regex;
/*
 * Problem Statement :UC2 As a User need to enter a valid Last Name 
 * - Last name starts with Cap and has minimum 3 characters
 * 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {
	/*
	 * regex pattern for lastname
	 * Pattern class defines a pattern to be used in search
	 * Matcher class used to search for the pattern
	 * Boolean matches test whether the regular expression matches the pattern.
	 */
	public static void isValidFirstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);

		if (matcher.matches()) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
	
	public static void isValidLastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);

		if (matcher.matches()) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}
