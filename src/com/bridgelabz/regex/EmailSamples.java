package com.bridgelabz.regex;
/*
 * Problem Statement UC8 - Should clear all email samples provided separately
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSamples {
	
	//method for clear all email samples.
	public static void testValidEmails() {
	    ArrayList<String> emails = new ArrayList<>();
	    // Valid emails samples
	    emails.add("abc@yahoo.com");
	    emails.add("abc-100@yahoo.com");
	    emails.add("abc.100@yahoo.com");
	    emails.add("abc111@abc.com");
	    emails.add("abc-100@abc.net");
	    emails.add("abc.100@abc.com.au");
	    emails.add("abc@1.com");
	    emails.add("abc@gmail.com.com");
	    emails.add("abc+100@gmail.com");

	    // Invalid emails samples
	    emails.add("\n");
	    emails.add("abc");
	    emails.add("abc@.com.my");
	    emails.add("abc123@gmail.a");
	    emails.add("abc123@.com");
	    emails.add("abc123@.com.com");
	    emails.add(".abc@abc.com");
	    emails.add("abc()*@gmail.com");
	    emails.add("abc@%*.com");
	    emails.add("abc..2002@gmail.com");
	    emails.add("abc.@gmail.com");
	    emails.add("abc@abc@gmail.com");
	    emails.add("abc@gmail.com.1a");
	    emails.add("abc@gmail.com.aa.au");
	    for (String email : emails) {
	        UserDetailsValidation.isValidEmail(email);
	      }
	  }
	
	// method for check email
		public static void checkEmail() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter an email: ");
			String email = scanner.next();
			UserDetailsValidation.isValidEmail(email);
			scanner.close();
		}
	
	public static String isValidEmail(String email) {
	    String regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2,3})*$";
		if (validate(regex, email)) {
			System.out.println("valid");
		}
		 else {
			System.out.println("invalid");
		}
		return regex;
	  }

	public static boolean validate(String regex, String pattern) {
	    Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(pattern);
	    return m.matches();
	  }

	public static void main(String[] args) {
		checkEmail();
	}

}
