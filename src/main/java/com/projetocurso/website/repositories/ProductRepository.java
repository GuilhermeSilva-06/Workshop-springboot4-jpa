package com.projetocurso.website.repositories;

import com.projetocurso.website.entities.Category;
import com.projetocurso.website.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
