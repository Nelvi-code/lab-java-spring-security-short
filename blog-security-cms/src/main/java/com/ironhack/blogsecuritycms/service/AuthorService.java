package com.ironhack.blogsecuritycms.service;

import com.ironhack.blogsecuritycms.model.Author;
import com.ironhack.blogsecuritycms.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    // Obtener todos los autores
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    // Obtener un autor por su id
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    // Guardar un nuevo autor
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    // Actualizar un autor existente
    public Author updateAuthor(Long id, Author author) {
        author.setId(id);
        return authorRepository.save(author);
    }

    // Eliminar un autor por id
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }

}