package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.Orders;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.UserRepo;
import net.bytebuddy.matcher.CollectionOneToOneMatcher;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@Component
public class UserService {

    private final UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public void userOperations() {

        User u = new User();
        u.setName("TestUser");

        Orders orders = new Orders();
        orders.setCreated_date(LocalDate.now());
        orders.setTotal(99.9);

        u.setOrders(Collections.singletonList(orders));

        Address address = new Address();
        address.setStreet("Gazoz sokak");
        address.setNumber("7");
        address.setCity("Istanbul");

        u.setAddress(address);

        repo.save(u);

        System.out.println(u.getId());

        System.out.println(repo.findAll());
    }
}
