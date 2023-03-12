package com.ashutosh.main;

import java.util.Scanner;

import com.ashutosh.model.Employee;
import com.ashutosh.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		Employee empObj=new Employee("Ashutosh","Tripathi");
		CredentialService csObj=new CredentialService();
		int choice;
		char[] password=csObj.generatePassword();
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
	}

}
