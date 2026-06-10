package com.ironhack.blogsecuritycms.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String post;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}