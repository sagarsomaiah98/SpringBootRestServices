package com.springServices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springServices.Controller.Library;
import com.springServices.Repository.LibraryRepository;

@Service
public class Libraryservice {
	
	@Autowired
	LibraryRepository repo;
	
	public String buildId(String isbn,int aisle) {
		
		String id =isbn+aisle;;
		return id;
		
		
		
	}
	
	public boolean checkBookAlreadyExists(String id) {
		
		Optional<Library> lib=repo.findById(id);
		
		if(lib.isPresent())
			return true;
		else
			return false;
	}

}
