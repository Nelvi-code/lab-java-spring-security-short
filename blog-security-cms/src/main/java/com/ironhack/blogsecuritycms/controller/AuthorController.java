package com.ironhack.blogsecuritycms.controller;

import com.ironhack.blogsecuritycms.model.Author;
import com.ironhack.blogsecuritycms.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    // Obtener todos los autores
    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    // Obtener un autor por id
    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    // Crear un nuevo autor
    @PostMapping
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    // Actualizar un autor existente
    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id,
                               @RequestBody Author author) {
        return authorService.updateAuthor(id, author);
    }

    // Eliminar un autor
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }
}