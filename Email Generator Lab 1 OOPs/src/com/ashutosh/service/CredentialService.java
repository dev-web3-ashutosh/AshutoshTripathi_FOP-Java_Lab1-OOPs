package com.ashutosh.service;

import java.util.Random;

public class CredentialService {
	public char[] generatePassword() {
		char[] pwd=new char[8]; //'pwd' is character array of length 8
		Random rand=new Random(); //'rand' is an object of the Random class
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters=capitalLetters.toLowerCase();
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*()_=+-/?<>";
		String values=capitalLetters+smallLetters+numbers+specialCharacters;
		for(int i=0;i<8;i++) {
			pwd[i]=values.charAt(rand.nextInt(values.length()));
		}
		return pwd;
	}
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".google.com";
		return email;
	}
	public void showCredentials(String name, String email, char[] password) {
		System.out.println("Dear "+name+", your generated credentials are as follows");
		System.out.println("Email    -->"+email);
		System.out.println("Password -->"+String.valueOf(password));
	}
}
