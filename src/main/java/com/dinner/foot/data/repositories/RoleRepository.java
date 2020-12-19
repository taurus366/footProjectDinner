package com.dinner.foot.data.repositories;

import com.dinner.foot.data.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByAuthority(String authority);
}
