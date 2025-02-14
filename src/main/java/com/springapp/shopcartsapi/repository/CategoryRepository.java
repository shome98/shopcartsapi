package com.springapp.shopcartsapi.repository;

import com.springapp.shopcartsapi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);
    boolean existsByName(String name);
}
