package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sheryians.major.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
