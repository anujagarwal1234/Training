package com.yash.service;

import java.util.ArrayList;
import java.util.List;

import com.yash.model.Employee;

public interface EmployeeService 
{
	public ArrayList<Employee> getEmployeeByID(int id);
	public List<Employee> getEmployeesByName(String name);
	public List<Employee> getHighSalariedEmployee();
	public List<Employee> getEmployeeByNameAndSalary(String name,double salary);
	public void getDeptList();
	public void getCompleteExpenditure();
	public static ArrayList<Employee> initEmpList()
	{
	ArrayList<Employee> empList = new ArrayList<Employee>();
	Employee e1 = new Employee(101,"Anuj Agarwal",25000.00,"IT");
	Employee e2 = new Employee(102,"Aman Bansal",20000.00,"Sales");
	Employee e3 = new Employee(103,"Mayank Goyal",50000.00,"Buisness");
	Employee e4 = new Employee(104,"Chitransh Pandey",4000.00,"Marketing");
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	return empList;
	}
}
