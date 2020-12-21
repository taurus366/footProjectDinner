package com.dinner.foot.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Supplements")
public class Supplement extends BaseEntity{

    private String name;

    @ManyToMany()
    private List<Food> foods;

    @ManyToMany(mappedBy = "supplement")
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Supplement() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
