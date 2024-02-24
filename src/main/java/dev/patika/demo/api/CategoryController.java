package dev.patika.demo.api;

import dev.patika.demo.business.abstracts.ICategoryService;
import dev.patika.demo.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/find-all")
    public List<Category> findAll() {
        return this.categoryService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category findById(@PathVariable("id") int id) {
        return this.categoryService.findById(id);
    }

    @PostMapping()
    public Category save(@RequestBody Category category){

        return this.categoryService.save(category);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public Category update(@RequestBody Category category){
     Category updatedCategory =  this.categoryService.update(category);
     return updatedCategory;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@PathVariable("id") int id){
        this.categoryService.delete(id);
        return true;
    }


}
