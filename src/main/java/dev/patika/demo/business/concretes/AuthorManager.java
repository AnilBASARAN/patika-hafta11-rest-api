package dev.patika.demo.business.concretes;

import dev.patika.demo.business.abstracts.IAuthorService;
import dev.patika.demo.dao.IAuthorRepo;
import dev.patika.demo.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorManager implements IAuthorService {

    @Autowired
    private IAuthorRepo authorRepo;

    @Override
    public Author get(Long id) {
        return this.authorRepo.findById(id).orElseThrow();
    }

    @Override
    public boolean delete(Long id) {
        this.authorRepo.delete(this.get(id));
        return true;
    }

    @Override
    public Author save(Author author) {
        return this.authorRepo.save(author);
    }

    @Override
    public String delete(Author author) {
         this.authorRepo.delete(author);
        return author.getAuthorId()+"id'li yazar silindi";
    }

    @Override
    public Author findById(Long id) {
        return this.authorRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Author> findAll() {
        return this.authorRepo.findAll();
    }

    @Override
    public Author update(Author author) {
        this.get(author.getAuthorId());
        return this.authorRepo.save(author);
    }
}
