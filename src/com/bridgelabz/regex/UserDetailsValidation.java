package com.bridgelabz.regex;
/*
 * Problem Statement: UC4 As a User need to follow pre-defined Mobile Format 
 * - E.g. 91 9919819801 - Country code follow by space and 10 digit number
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
		
	public static void isValidFirstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		if (validate(regex, firstName)) {
			System.out.println("valid");
		}
		 else {
			System.out.println("invalid");
		}
	}
	
	public static void isValidLastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		if (validate(regex, lastName)) {
			System.out.println("valid");
		}
		 else {
			System.out.println("invalid");
		}
	}
	
	public static void isValidEmail(String email) {
	    regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2,3})*$";
		if (validate(regex, email)) {
			System.out.println("valid");
		}
		 else {
			System.out.println("invalid");
		}
	  }
	
	public static void isValidMobileNumber(String mobileNumber) {
	    System.out.println(mobileNumber);
	    regex = "^[0-9]{2} [0-9]{10}$";
	    if (validate(regex, mobileNumber)) {
	    	System.out.println("valid");
	    }
	    else{
	    	System.out.println("invalid");
	    }
	  }
	
	public static boolean validate(String regex, String pattern) {
	    Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(pattern);
	    return m.matches();
	  }

}
