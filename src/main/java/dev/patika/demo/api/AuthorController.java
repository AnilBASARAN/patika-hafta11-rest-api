package dev.patika.demo.api;

import dev.patika.demo.business.abstracts.IAuthorService;
import dev.patika.demo.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/author")
public class AuthorController  {

    @Autowired
    private IAuthorService authorService;

/*
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Author get(Long id) {
        return this.authorService.get(id);
    }
*/


   @DeleteMapping()
    public boolean delete(Long id) {
        this.authorService.delete(id);
        return true;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Author save(@RequestBody Author author) {
        return this.authorService.save(author);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Author update(@RequestBody Author author) {
        return this.authorService.update(author);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(Author author) {
        this.authorService.delete(author);
        return author.getAuthorId()+"id'li yazar silindi";
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Author findById(@PathVariable("id") Long id) {
        return this.authorService.findById(id);
    }

    @GetMapping("/find-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Author> findAll() {
        return this.authorService.findAll();
    }


}
