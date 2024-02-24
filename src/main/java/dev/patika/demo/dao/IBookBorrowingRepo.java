package dev.patika.demo.dao;

import dev.patika.demo.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookBorrowingRepo extends JpaRepository<BookBorrowing,Long> {
}
