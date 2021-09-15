package com.mycompany.app;

import java.util.Scanner;

public class ValidatePassword {
	
	public static void main(String[] args){

		  Scanner input = new Scanner(System.in);

		  // Get the password
		  System.out.print("Password: ");
		  String password = input.nextLine();

		  // Check for validity
		  if (isValidPassword(password)) {
		    System.out.println("Valid Password");
		  } else {
		    System.out.println("Invalid Password");
		  }
		  input.close();
		} // end method
	
	/**
	 * method isValidPassword checks if a password meets the
	 * following criteria:
	 * 1) >= 8 characters
	 * 2) At least 2 digits
	 * 3) Consists only of letters and digits
	 * @param password The password to check
	 * @return true or false depending if the password is valid
	 */
	public static boolean isValidPassword(String password) {
		int digitCounter = 0;
		if (password.length() >= 8) {
			for (int i = 0; i < password.length(); i++) {
				if(Character.isDigit(password.charAt(i))) {
					digitCounter++;
				}
			}
			if(digitCounter >= 2) {
			return true;
			}
		}
		return false;
	}
}
