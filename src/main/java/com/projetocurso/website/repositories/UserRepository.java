package com.projetocurso.website.repositories;

import com.projetocurso.website.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
