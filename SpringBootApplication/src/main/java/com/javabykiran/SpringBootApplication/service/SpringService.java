package com.javabykiran.SpringBootApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.SpringBootApplication.dao.SpringDao;

@Service
public class SpringService {

	@Autowired
	SpringDao springdao;
	
	public List<String> getAlluser() throws Exception {
		// TODO Auto-generated method stub
		List<String> listuser=springdao.getAlluser();
		return listuser;
	}

	public List<String> getAlluserbyid(int id) throws Exception {
		// TODO Auto-generated method stub
		List<String> listuser=springdao.getAlluserbyid(id);
		
		return listuser;
	}

	public List<String> getAlluserbyname(String name) throws Exception {
	
		List<String> listuser=springdao.getAlluserbyname(name);
		return listuser;
	}

	public List<String> getAlluserbystatus(String status) throws Exception {
	
		List<String> listuser=springdao.getAlluserbystatus(status);
		return listuser;
	}

}
