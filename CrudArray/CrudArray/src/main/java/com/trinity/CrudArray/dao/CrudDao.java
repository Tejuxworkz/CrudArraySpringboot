package com.trinity.CrudArray.dao;

import org.springframework.stereotype.Component;

import com.trinity.CrudArray.dto.RegisterDto;

@Component
public class CrudDao {


	RegisterDto dtos[] = new RegisterDto[3];
	int index = 0;

	public boolean saveTheData(RegisterDto data) {
		dtos[index] = data;
		index++;
		System.out.println("saving data ");
		return true;

	}

	public boolean displayTheAllDeatils() {

		for (int i=0;i<dtos.length;i++) {

			if (dtos[i] != null) {
				System.out.println("-------------------");
				System.out.println("data are displaying");
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getEmail());
				System.out.println(dtos[i].getContact());
				System.out.println(dtos[i].getPassword());
				System.out.println("-------------------");
				System.out.println();
			}
		}
		return true;
	}
	
	public boolean getByName(String name) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i].getName().equals(name)) {
				System.out.println("data are displaying by getByName()");
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getEmail());
				System.out.println(dtos[i].getContact());
				System.out.println(dtos[i].getPassword());	
				System.out.println("******************");
			}
		}
	return true;
	}
	
	
	public boolean getByContact(long contact) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i].getContact()==contact) {
				System.out.println("data are displaying by getByContact()");
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getEmail());
				System.out.println(dtos[i].getContact());
				System.out.println(dtos[i].getPassword());	
				System.out.println("******************");
			}
		}
	return true;
	}
	
	
	public boolean getByEmail(String email) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i].getEmail().equals(email)) {
				System.out.println("data are displaying by getByEmail()");
				System.out.println(dtos[i].getName());
				System.out.println(dtos[i].getEmail());
				System.out.println(dtos[i].getContact());
				System.out.println(dtos[i].getPassword());	
				System.out.println("******************");
			}
		}
	return true;
	}
	
	public boolean updatePasswordByEmail(String email,String password) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i].getEmail().equals(email)) {
				dtos[i].setPassword(password);
				System.out.println("Updating......");
			}	
			}
		return true;
	}

	public boolean deleteByName(String name) {
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i].getName().equals(name)) {
				dtos[i]=null;
				System.out.println("Deleting......");
			}
		}
	return true;
	}
	
	
}
	
	
