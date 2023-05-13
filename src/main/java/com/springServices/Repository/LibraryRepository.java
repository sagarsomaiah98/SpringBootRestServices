package com.springServices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springServices.Controller.Library;

public interface LibraryRepository extends JpaRepository<Library, String> {

}
