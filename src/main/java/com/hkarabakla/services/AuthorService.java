package com.hkarabakla.services;

import com.hkarabakla.repositories.AuthorRepo;
import org.springframework.stereotype.Component;

@Component
public class AuthorService {

    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public void authorOperations(){

    }
}
