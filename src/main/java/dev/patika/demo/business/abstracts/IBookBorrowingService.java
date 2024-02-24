package dev.patika.demo.business.abstracts;
import dev.patika.demo.entity.BookBorrowing;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IBookBorrowingService {
    public BookBorrowing get(Long id);
    public boolean delete(Long id);
    BookBorrowing save(BookBorrowing bookBorrowing);
    String delete(BookBorrowing bookBorrowing);
    BookBorrowing findById(Long id);
    List<BookBorrowing> findAll();
    BookBorrowing update(BookBorrowing bookBorrowing);
}
