package com.blakegifford.mvc.repositories;

//import java.awt.print.Book;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.blakegifford.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

	List<Book> findAll();
	
}
