package com.springServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springServices.Repository.LibraryRepository;
import com.springServices.service.Libraryservice;

@RestController
public class LibraryController {
	
	@Autowired
	LibraryRepository repo;
	@Autowired
	Libraryservice serv;
	
	@PostMapping("/addBook")
	public ResponseEntity<Addresponse> addBookImplementation(@RequestBody Library library) {
		
		String id=serv.buildId(library.getIsbn(), library.getAisle());
		
		Addresponse response= new Addresponse();
		if(!serv.checkBookAlreadyExists(id))
		{
			library.setId(id);
			repo.save(library); 
		response.setMsg("Successfully book is added");
		response.setId(id);
		HttpHeaders headers = new HttpHeaders();
		headers.add("unique", id);
		
		return new ResponseEntity<Addresponse>(response,headers,HttpStatus.CREATED);
		
		}
		else
		{
			response.setMsg("Book Already Exists");
			response.setId(id);
			return new ResponseEntity<Addresponse>(response,HttpStatus.ACCEPTED);
		}
	}

}
