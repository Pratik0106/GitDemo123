package com.javabykiran.SpringBootApplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.SpringBootApplication.entity.Employee;
import com.javabykiran.SpringBootApplication.service.SpringService;

@RestController
public class SpringController {

	@Autowired
	SpringService springservice;
	@RequestMapping("/welcome")
	public String methodofstring()
	{
		return "Welcome";
	}
	
	@RequestMapping("/getvalue")
	public int methodofInt()
	{
		return 20;
	}
	
	@RequestMapping("/getarraylist")
	public ArrayList<String> methodofArrayList()
	{
		ArrayList<String> arraylist=new ArrayList<>();
		arraylist.add("abc");
		arraylist.add("pqr");
		arraylist.add("xyz");
		
		return arraylist;
	}
	
	@RequestMapping("/getintegervalues")
	public ArrayList<Integer> methodofIntegerarray()
	{
		ArrayList<Integer> arraylist=new ArrayList<>();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		
		return arraylist;
	}
	
	
	@RequestMapping("/getemployee")
	public ArrayList<Employee> getEmployee()
	{
		ArrayList<Employee> arraylistemp=new ArrayList<>();
		
		Employee emp=new Employee();
		emp.setId(11);
		emp.setName("Pqr");
		System.out.println(emp);
		Employee emp1=new Employee();
		emp1.setId(12);
		emp1.setName("abc");
		System.out.println(emp1);
		
		Employee emp2=new Employee();
		emp2.setId(13);
		emp2.setName("Pqr");
		
		
		System.out.println(emp2);
		
		arraylistemp.add(emp);
		arraylistemp.add(emp1);
		arraylistemp.add(emp2);
		return arraylistemp;
	}
	
	@RequestMapping("/getalluser")
	public List<String> getAlluser() throws Exception
	{
		System.out.println("GetAlluser() API 1");
		List<String> listuser=springservice.getAlluser();
		return listuser;
	}
	
	@RequestMapping("/getalluserbyid/{id}")
	public List<String> getAlluserbyid(@PathVariable("id") int id) throws Exception
	{
		List<String> listuser=springservice.getAlluserbyid(id);
		return listuser;
	}
	@RequestMapping("/getalluserbyname/{name}")
	public List<String> getAlluserbyname(@PathVariable("name") String name) throws Exception 
	{
		List<String> listuser=springservice. getAlluserbyname(name);
		return listuser;
	}
	
	@RequestMapping("/getalluserbystatus/{status}")
	public List<String> getAlluserbystatus(@PathVariable("status") String status) throws Exception
	{
		List<String> listuser=springservice.getAlluserbystatus(status);
		return listuser;
	}
}
