package com.hkarabakla.services;

import com.hkarabakla.entities.Authors;
import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.entities.Orders;
import com.hkarabakla.repositories.CategoryRepo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collections;
import java.util.UUID;

@Component
public class CategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public void categoryOperations() {

        Book b1 = new Book();
        b1.setIsbn(UUID.randomUUID().toString());
        b1.setName("Spring in Action");
        b1.setAddedDate(LocalDate.now());
        b1.setPublishedDate(LocalDate.now());
        b1.setPrice(20.99);
        b1.setCurrency("Euro");
        b1.setImageUrl("URL");
        b1.setDescription("This book is about spring framework");

        Authors fistAuthor = new Authors();
        fistAuthor.setName("Johnny deep");
        fistAuthor.setBooks(fistAuthor.getBooks());

        b1.setAuthors(Collections.singletonList(fistAuthor));

        Orders fOrders = new Orders();
        fOrders.setCreated_date(LocalDate.now());
        fOrders.setTotal(77.99);
        fOrders.setBookList(Collections.singletonList(b1));

        Category c1 = new Category();
        c1.setName("Computer Science");
        c1.setBooks(Collections.singletonList(b1));

        categoryRepo.save(c1);

        System.out.println(c1);
    }
}
