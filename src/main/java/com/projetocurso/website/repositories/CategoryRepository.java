package com.projetocurso.website.repositories;

import com.projetocurso.website.entities.Category;
import com.projetocurso.website.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {
}
