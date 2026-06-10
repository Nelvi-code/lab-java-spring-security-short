package com.ironhack.blogsecuritycms.service;

import com.ironhack.blogsecuritycms.model.BlogPost;
import com.ironhack.blogsecuritycms.repository.BlogPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {

    private final BlogPostRepository blogPostRepository;

    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    // Obtener todos los posts
    public List<BlogPost> getAllPosts() {
        return blogPostRepository.findAll();
    }

    // Obtener un post por id
    public BlogPost getPostById(Long id) {
        return blogPostRepository.findById(id).orElse(null);
    }

    // Guardar un nuevo post
    public BlogPost savePost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    // Actualizar un post existente
    public BlogPost updatePost(Long id, BlogPost blogPost) {
        blogPost.setId(id);
        return blogPostRepository.save(blogPost);
    }

    // Eliminar un post por id
    public void deletePost(Long id) {
        blogPostRepository.deleteById(id);
    }
}