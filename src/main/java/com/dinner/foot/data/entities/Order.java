package com.dinner.foot.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity{

    @ManyToOne
    private Food food;

    @ManyToOne
    private User user;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Supplement> supplement;

    public Order() {
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Supplement> getSupplement() {
        return supplement;
    }

    public void setSupplement(List<Supplement> supplement) {
        this.supplement = supplement;
    }
}
