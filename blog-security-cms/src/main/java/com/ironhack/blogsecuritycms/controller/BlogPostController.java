package com.ironhack.blogsecuritycms.controller;

import com.ironhack.blogsecuritycms.model.BlogPost;
import com.ironhack.blogsecuritycms.service.BlogPostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    // Obtener todos los posts
    @GetMapping
    public List<BlogPost> getAllPosts() {
        return blogPostService.getAllPosts();
    }

    // Obtener un post por id
    @GetMapping("/{id}")
    public BlogPost getPostById(@PathVariable Long id) {
        return blogPostService.getPostById(id);
    }

    // Crear un nuevo post
    @PostMapping
    public BlogPost savePost(@RequestBody BlogPost blogPost) {
        return blogPostService.savePost(blogPost);
    }

    // Actualizar un post existente
    @PutMapping("/{id}")
    public BlogPost updatePost(@PathVariable Long id,
                               @RequestBody BlogPost blogPost) {
        return blogPostService.updatePost(id, blogPost);
    }

    // Eliminar un post
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        blogPostService.deletePost(id);
    }
}