package com.hkarabakla.repositories;

import com.hkarabakla.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BookRepo extends CrudRepository<Book, UUID> {
}
