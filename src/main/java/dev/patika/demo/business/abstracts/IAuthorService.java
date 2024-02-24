package dev.patika.demo.business.abstracts;

import dev.patika.demo.entity.Author;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IAuthorService {
    public Author get(Long id);
    public boolean delete(Long id);
    Author save(Author author);
    String delete(Author author);
    Author findById(Long id);
    List<Author> findAll();
    Author update(Author author);
}
