package dev.patika.demo.business.concretes;

import dev.patika.demo.business.abstracts.IBookBorrowingService;
import dev.patika.demo.dao.IBookBorrowingRepo;
import dev.patika.demo.entity.BookBorrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookBorrowingManager implements IBookBorrowingService {

    @Autowired
    private IBookBorrowingRepo bookBorrowingRepo;
    @Override
    public BookBorrowing get(Long id) {
        return this.bookBorrowingRepo.findById(id).orElseThrow();
    }

    @Override
    public boolean delete(Long id) {
        BookBorrowing bookBorrowing = this.get(id);
        this.bookBorrowingRepo.delete(bookBorrowing);
        return true;
    }

    @Override
    public BookBorrowing save(BookBorrowing bookBorrowing) {
        return this.bookBorrowingRepo.save(bookBorrowing);
    }

    @Override
    public String delete(BookBorrowing bookBorrowing) {

        this.bookBorrowingRepo.delete(bookBorrowing);
        return bookBorrowing.getBookBorrowingId()+" id li randevu silindi";
    }

    @Override
    public BookBorrowing findById(Long id) {
        return this.bookBorrowingRepo.findById(id).orElseThrow();
    }

    @Override
    public List<BookBorrowing> findAll() {
        return this.bookBorrowingRepo.findAll();
    }

    @Override
    public BookBorrowing update(BookBorrowing bookBorrowing) {
        this.get(bookBorrowing.getBookBorrowingId());
        return this.bookBorrowingRepo.save(bookBorrowing);
    }
}
