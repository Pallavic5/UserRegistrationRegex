package com.bridgelabz.regex;
/*
 * Problem Statement :UC3 As a User need to enter a valid Email 
 * - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts 
 * (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
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
		static String regex;
		static Pattern pattern;
		static Matcher matcher;
	public static void isValidFirstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(firstName);

		if (matcher.matches()) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
	
	public static void isValidLastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(lastName);

		if (matcher.matches()) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
	
	public static void isValidEmail(String email) {
	    regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2,3})*$";
	    pattern  = Pattern.compile(regex);
	    matcher= pattern.matcher(email);
	    if (matcher.matches()) {
	    	System.out.println("valid");
	    }
	    else {
	    	System.out.println("invalid");
	    }
	  }
}
