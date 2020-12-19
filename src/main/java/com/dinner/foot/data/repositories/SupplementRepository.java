package com.dinner.foot.data.repositories;

import com.dinner.foot.data.entities.Supplement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplementRepository extends JpaRepository<Supplement,Integer> {
}
