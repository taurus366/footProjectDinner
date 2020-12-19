package com.dinner.foot.data.repositories;

import com.dinner.foot.data.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {
}
