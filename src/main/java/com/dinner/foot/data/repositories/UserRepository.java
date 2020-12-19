package com.dinner.foot.data.repositories;

import com.dinner.foot.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
