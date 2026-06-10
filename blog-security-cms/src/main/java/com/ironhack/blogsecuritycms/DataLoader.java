package com.ironhack.blogsecuritycms;

import com.ironhack.blogsecuritycms.model.Author;
import com.ironhack.blogsecuritycms.model.BlogPost;
import com.ironhack.blogsecuritycms.repository.AuthorRepository;
import com.ironhack.blogsecuritycms.repository.BlogPostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BlogPostRepository blogPostRepository;

    public DataLoader(AuthorRepository authorRepository, BlogPostRepository blogPostRepository) {
        this.authorRepository = authorRepository;
        this.blogPostRepository = blogPostRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author aiko = authorRepository.save(new Author(null, "Aiko Tanaka"));
        Author jonas = authorRepository.save(new Author(null, "Jonas Schmidt"));
        Author cas = authorRepository.save(new Author(null, "Cas Van Dijk"));

        blogPostRepository.save(new BlogPost(null, "Boost Your Productivity with 10 Easy Tips",
                "Productivity - we all want it but it seems ...", aiko));

        blogPostRepository.save(new BlogPost(null, "How to Focus",
                "Do you ever sit down to work and find yourself ...", aiko));

        blogPostRepository.save(new BlogPost(null, "Learn to Speed Read in 30 Days",
                "Knowledge, not ability, is the great determiner of ...", jonas));
    }
}