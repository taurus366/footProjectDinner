package com.dinner.foot.data.repositories;

import com.dinner.foot.data.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {

    City findByName(String name);
}
