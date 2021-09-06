package com.yash.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.yash.model.Employee;
import com.yash.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService 
{
	
	//EmployeeServiceImpl obj = new EmployeeServiceImpl();
		
	 ArrayList<Employee> MyList = EmployeeService.initEmpList();
	

	public ArrayList<Employee> getEmployeeByID(int id) {
		ArrayList<Employee> ByIdList  = (ArrayList<Employee>) MyList.stream()
				.filter(i->i.id==id)
				.collect(Collectors.toList());
		return ByIdList;
		
	}


	@Override
	public List<Employee> getEmployeesByName(String str) {
		ArrayList<Employee> ByNameList = (ArrayList<Employee>) MyList.stream()
				.filter(i->i.name.contains(str))
				.collect(Collectors.toList());
		return ByNameList;
	}

	@Override
	public List<Employee> getEmployeeByNameAndSalary(String s, double sal) {
				
		ArrayList<Employee> ByNameAndSalary  = (ArrayList<Employee>) MyList.stream()
				.filter(x->(x.name.contains(s))&&(x.salary==sal))
				.collect(Collectors.toList());

		return ByNameAndSalary;
	}

	@Override
	public void getDeptList() {
		List<String> d = MyList.stream()
				.map(x->x.department)
				.collect(Collectors.toList());
		
		System.out.println(d);
		
	}

	@Override
	public List<Employee> getHighSalariedEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getCompleteExpenditure() {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void getCompleteExpenditure() {
//		Employee maxSal = Collections.max(MyList);
//	}	
}
