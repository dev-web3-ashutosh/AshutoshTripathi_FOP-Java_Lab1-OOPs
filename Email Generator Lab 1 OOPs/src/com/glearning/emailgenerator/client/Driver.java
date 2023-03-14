package com.glearning.emailgenerator.client;

import java.util.Scanner;

import com.glearning.emailgenerator.model.Employee;
import com.glearning.emailgenerator.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		Employee empObj=new Employee("Ashutosh","Tripathi");
		CredentialService csObj=new CredentialService();
		Scanner sc=new Scanner(System.in);
		int choice;
		String email;
		char[] password=csObj.generatePassword();
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			email=csObj.generateEmailAddress(empObj.getFirstName(), empObj.getLastName(), "tech");
			csObj.showCredentials(empObj.getFirstName(), email, password);
			break;
		case 2:
			email=csObj.generateEmailAddress(empObj.getFirstName(), empObj.getLastName(), "admin");
			csObj.showCredentials(empObj.getFirstName(), email, password);
			break;
		case 3:
			email=csObj.generateEmailAddress(empObj.getFirstName(), empObj.getLastName(), "hr");
			csObj.showCredentials(empObj.getFirstName(), email, password);
			break;
		case 4:
			email=csObj.generateEmailAddress(empObj.getFirstName(), empObj.getLastName(), "legal");
			csObj.showCredentials(empObj.getFirstName(), email, password);
			break;
		default:
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
