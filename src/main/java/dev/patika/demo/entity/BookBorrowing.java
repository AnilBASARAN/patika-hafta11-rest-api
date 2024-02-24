package dev.patika.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_borrowing_table")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookborrowing_id",columnDefinition = "serial")
    private Long bookBorrowingId;

    private String borrowerName;
    private LocalDate borrowingDate;
    private String borrowerEmail;
    private LocalDate borrowerReturnDate;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Book book;

}
