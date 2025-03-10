package com.hkarabakla.repositories;

import com.hkarabakla.entities.Orders;
import com.hkarabakla.entities.User;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {

    User findByName(String name);

    List<User> findAllByNameContainingIgnoreCase(String name);

    List<User> findAllByIdLessThanAndName(Integer id, String name);

    List<User> findAllByOrdersIn(List<Orders> orders);
}
