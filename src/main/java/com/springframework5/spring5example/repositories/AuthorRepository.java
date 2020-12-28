package com.springframework5.spring5example.repositories;

import com.springframework5.spring5example.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
