package com.ironhack.blogsecuritycms.repository;

import com.ironhack.blogsecuritycms.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}