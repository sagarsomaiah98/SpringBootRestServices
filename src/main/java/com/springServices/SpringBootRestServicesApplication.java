package com.springServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springServices.Controller.Library;
import com.springServices.Repository.LibraryRepository;


@SpringBootApplication
public class SpringBootRestServicesApplication {
//implements CommandLineRunner{

	@Autowired
	LibraryRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServicesApplication.class, args);
	}

	/*@Override
	public void run(String args[]) throws Exception {
		
		
		Library lib=repo.findById("Appi143").get();
		System.out.println("data");
		System.out.println(lib.getAuthor());
		
		Library en= new Library();
		
		en.setBook_name("Java");
		en.setAuthor("Eric");
		en.setAisle(525);
		en.setIsbn("Jam");
		en.setId("Jam525");
		
		repo.save(en);
		
		List<Library> allrecords=repo.findAll();
		
		for(Library item:allrecords) {
			
			System.out.print(item.getAisle()+" | ");
			System.out.print(item.getAuthor()+" | ");
			System.out.print(item.getBook_name()+" | ");
			System.out.print(item.getId()+" | ");
			System.out.println();
			
		}
		repo.delete(en);*/
		
		
		
		
		
		
		
		

}
