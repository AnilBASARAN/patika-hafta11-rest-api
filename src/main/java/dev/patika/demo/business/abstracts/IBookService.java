package dev.patika.demo.business.abstracts;
import dev.patika.demo.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBookService {
    public Book get(Long id);
    public boolean delete(Long id);
    Book save(Book book);
    String delete(Book book);
    Book findById(Long id);
    List<Book> findAll();
    Book update(Book book);
}
