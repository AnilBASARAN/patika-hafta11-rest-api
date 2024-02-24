package dev.patika.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",columnDefinition = "serial")
    private Long authorId;
    private String authorName;
    private LocalDate authorBirthDate;
    private String authorCountry;

    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private List<Book> bookList;
}
