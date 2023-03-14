package com.glearning.emailgenerator.service;

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
		
		//ensure pwd contains at least 1 Upper case letter
		pwd[0]=capitalLetters.charAt(rand.nextInt(capitalLetters.length()));
		
		//ensure pwd contains at least 1 Lower case letter
		pwd[1]=smallLetters.charAt(rand.nextInt(smallLetters.length()));
		
		//ensure pwd contains at least 1 number
		pwd[2]=numbers.charAt(rand.nextInt(numbers.length()));
		
		//ensure pwd contains at least 1 special character
		pwd[3]=specialCharacters.charAt(rand.nextInt(specialCharacters.length()));
		
		//fill remaining elements of char array pwd with random elements from string 'values'
		for(int i=4;i<8;i++) {
			pwd[i]=values.charAt(rand.nextInt(values.length()));
		}
		
		//shuffle password
		for(int i=0;i<8;i++) {
			int j=rand.nextInt(8); //generates a random integer from 0 to 7
			char temp=pwd[i];
			pwd[i]=pwd[j];
			pwd[j]=temp;
		}
		return pwd;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".google.com";
		return email;
	}
	
	public void showCredentials(String name, String email, char[] password) {
		System.out.println("Dear "+name+" your generated credentials are as follows");
		System.out.println("Email    --> "+email);
		System.out.println("Password --> "+String.valueOf(password));
	}
}
