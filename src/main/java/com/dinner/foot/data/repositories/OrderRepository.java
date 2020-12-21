package com.dinner.foot.data.repositories;

import com.dinner.foot.data.entities.Order;
import com.dinner.foot.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findAllByUser(User user);
}
