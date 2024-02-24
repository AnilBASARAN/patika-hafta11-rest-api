package dev.patika.demo.api;

import dev.patika.demo.business.abstracts.IBookBorrowingService;
import dev.patika.demo.entity.BookBorrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/bookborrowing")
public class BookBorrowingController {

 @Autowired
 private IBookBorrowingService bookBorrowingService;

    @GetMapping("/find-all")
    public List<BookBorrowing> findAll() {
        return this.bookBorrowingService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BookBorrowing findById(@PathVariable("id") Long id) {
        return this.bookBorrowingService.findById(id);
    }

    @PostMapping()
    public BookBorrowing save(@RequestBody BookBorrowing bookBorrowing){
        return this.bookBorrowingService.save(bookBorrowing);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public BookBorrowing update(@RequestBody BookBorrowing bookBorrowing){
        BookBorrowing updatedCategory =  this.bookBorrowingService.update(bookBorrowing);
        return updatedCategory;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@PathVariable("id") Long id){
        this.bookBorrowingService.delete(id);
        return true;
    }
}
