package dev.patika.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_table")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id",columnDefinition = "serial")
    private Long bookId;
    private String bookName;
    private int bookStock;
    private int bookPublicationYear;

    @ManyToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "publisher_id")
    @JsonIgnore
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    private Author author;

    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private List<BookBorrowing> bookBorrowings;



    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "Book2Category",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    List<Category> categoryList;

}
