package dev.patika.demo.business.concretes;

import dev.patika.demo.business.abstracts.IBookService;
import dev.patika.demo.dao.IBookRepo;
import dev.patika.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookManager implements IBookService {

    @Autowired
    private IBookRepo bookRepo;

    @Override
    public Book get(Long id) {
        return this.bookRepo.findById(id).orElseThrow() ;
    }

    @Override
    public boolean delete(Long id) {
        Book deletedBook = this.get(id);
         this.bookRepo.delete(deletedBook);
        return true;
    }

    @Override
    public Book save(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public String delete(Book book) {
        this.bookRepo.delete(book);
        return book.getBookId()+"id li kitap silindi";
    }

    @Override
    public Book findById(Long id) {
        return this.bookRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Book> findAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book update(Book book) {
        return this.bookRepo.save(book);
    }
}
