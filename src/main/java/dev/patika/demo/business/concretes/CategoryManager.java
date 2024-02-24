package dev.patika.demo.business.concretes;

import dev.patika.demo.business.abstracts.ICategoryService;
import dev.patika.demo.dao.ICategoryRepo;
import dev.patika.demo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements ICategoryService {
    @Autowired
    private ICategoryRepo categoryRepo;

    @Override
    public Category save(Category category) {
        return this.categoryRepo.save(category);
    }

    @Override
    public String delete(Category category) {
        return null;
    }

    @Override
    public Category get(int id) {
        return this.categoryRepo.findById(id).orElseThrow();
    }
    @Override
    public boolean delete(int id) {
        Category category = this.get(id);
        this.categoryRepo.delete(category);
        return true;
    }

    @Override
    public Category findById(int id) {
        return this.categoryRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Category> findAll() {
        return this.categoryRepo.findAll();
    }

    @Override
    public Category update(Category category) {
        this.get(category.getCategoryId());
        return this.categoryRepo.save(category);
    }
}
