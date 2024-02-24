package dev.patika.demo.business.abstracts;

import dev.patika.demo.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface ICategoryService {
    public Category get(int id);
    public boolean delete(int id);
    Category save(Category category);
    String delete(Category category);
    Category findById(int id);
    List<Category> findAll();
    Category update(Category category);
}
