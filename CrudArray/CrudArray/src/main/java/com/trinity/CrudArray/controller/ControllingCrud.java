package com.trinity.CrudArray.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trinity.CrudArray.dao.CrudDao;
import com.trinity.CrudArray.dto.RegisterDto;



@RestController
public class ControllingCrud {
	
	@Autowired
	CrudDao arrayCRUDDAO;
	
	@GetMapping("get")
	public String getName() {
		return "Tejashwini";
	}
	
	@PostMapping("save")
	public RegisterDto registerDetails(@RequestBody RegisterDto data) {
		System.out.println(data.getName());
		System.out.println(data.getPassword());
		arrayCRUDDAO.saveTheData(data);
		return data;
	}
	
	@PostMapping("getByName")
	public String getByName(@RequestParam String name) {
		arrayCRUDDAO.getByName(name);
		return "Display all the details by getByName() ";
	}

	@PostMapping("getByContact")
	public String getByName(@RequestParam long contact) {
		arrayCRUDDAO.getByContact(contact);
		return "Display all the details by getByContact() ";
	}
	
	@PostMapping("getByEmail")
	public String getByEmail(@RequestParam String email) {
		arrayCRUDDAO.getByEmail(email);
		return "Display all the details by getByEmail() ";
	}

	
	@GetMapping("updatePasswordByEmail")
	public String updatePasswordByEmail(@RequestParam String email,@RequestParam String password) {
		arrayCRUDDAO.updatePasswordByEmail(email, password);
		System.out.println("method is calling");
		return email+"\t"+password;
	}
	
	@PostMapping("displaythealldetails")
	public String displaythealldetails() {
		arrayCRUDDAO.displayTheAllDeatils();
		return "Display all the details";
	}
	
	@PostMapping("deleteByName")
	public String deleteByName(@RequestParam String name) {
		arrayCRUDDAO.deleteByName(name);
		return "deleting the by deleteByName() ";
	}
	

}
