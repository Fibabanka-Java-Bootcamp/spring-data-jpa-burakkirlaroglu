package com.hkarabakla.services;

import com.hkarabakla.entities.Orders;
import com.hkarabakla.repositories.OrderRepo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class OrderService {

    private final OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void orderOperations(){

        Orders orders = new Orders();
        orders.setCreated_date(LocalDate.now());
        orders.setTotal(99.9);

        orderRepo.save(orders);

        System.out.println(orders);

    }
}
