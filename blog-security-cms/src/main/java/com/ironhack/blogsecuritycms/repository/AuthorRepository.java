package com.ironhack.blogsecuritycms.repository;

import com.ironhack.blogsecuritycms.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}