package com.dinner.foot.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Foods")
public class Food extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "foods",fetch = FetchType.EAGER)
    private List<Supplement> supplements;

    @ManyToMany(mappedBy = "foods")
    private List<User> users;

    public Food() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Supplement> getSupplements() {
        return supplements;
    }

    public void setSupplements(List<Supplement> supplements) {
        this.supplements = supplements;
    }
}
