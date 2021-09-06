package com.yash.main;
import java.util.ArrayList;
import java.util.Scanner;

import com.yash.model.Employee;
import com.yash.service.EmployeeService;
import com.yash.serviceimpl.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class Main
{

	private static final String String = null;

	public static void main( String[] args )
	{
		
		int choice;
		boolean check;
		Scanner sc = new Scanner(System.in); 
		EmployeeServiceImpl obj = new EmployeeServiceImpl();

		do
		{
		System.out.println("-----------------------------------------");
		System.out.println("1. Show All Employees: ");
		System.out.println("2. Search Employee by Name : ");
		System.out.println("3. Search Employee by Name and Salary : ");
		System.out.println("4. Get All Department List : ");
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();


		
		switch(choice)
		{
		case 1:
			//System.out.println(obj.getAllEmployee());
			break;
			
		case 2:
			String str;
			System.out.println("Enter Name : ");
			str = sc.next();
			System.out.println(obj.getEmployeesByName(str));
			break;
			
		case 3:
			String name;
			double salary;
			System.out.println("Enter Name and Salary : ");
			name = sc.next();
			salary = sc.nextDouble();
			System.out.println(obj.getEmployeeByNameAndSalary(name, salary));
			break;
		case 4:
			obj.getDeptList();
			break;
		case 5:
		default:
			System.out.println("Invalid Input");
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Write True to continue otherwise False to close Program : ");
		check = sc.nextBoolean();
		}while(check);
	}
}
