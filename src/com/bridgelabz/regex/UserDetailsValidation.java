package com.bridgelabz.regex;
/*
 * ProblemStatement : UC 8 Rule4- Has exactly one special character.
 * - NOTE – All rules must be passed
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
	
	 public static void isValidPassword(String password) {
		    regex = "^[a-z0-9A-Z]{8,}$";			//\w \Any word character, short for [a-zA-Z_0-9]
		    if (validate(regex, password)) {
		    	System.out.println("valid");
		    }
		    else {
		    	System.out.println("invalid");
		    }
		  }
	
	public static boolean validate(String regex, String pattern) {
	    Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(pattern);
	    return m.matches();
	  }

}
