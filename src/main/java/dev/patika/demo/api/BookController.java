package dev.patika.demo.api;

import dev.patika.demo.business.abstracts.IBookService;
import dev.patika.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/find-all")
    public List<Book> findAll() {
        return this.bookService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book findById(@PathVariable("id") Long id) {
        return this.bookService.findById(id);
    }

    @PostMapping()
    public Book save(@RequestBody Book book){
        return this.bookService.save(book);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public Book update(@RequestBody Book book){
        Book updatedbook =  this.bookService.update(book);
        return updatedbook;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@PathVariable("id") Long id){
        this.bookService.delete(id);
        return true;
    }
}
