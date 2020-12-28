package com.springframework5.spring5example.repositories;

import com.springframework5.spring5example.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
