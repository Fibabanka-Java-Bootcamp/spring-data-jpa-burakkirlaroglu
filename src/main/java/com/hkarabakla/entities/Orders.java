package com.hkarabakla.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Orders {
    @Id
    @GeneratedValue
    private int id;

    private LocalDate created_date;

    private double total;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return users;
    }

    public void setUser(User user) {
        this.users = user;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", created_date=" + created_date +
                ", total=" + total +
                '}';
    }
}
