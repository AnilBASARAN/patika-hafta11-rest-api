package dev.patika.demo.api;

import dev.patika.demo.business.abstracts.ICategoryService;
import dev.patika.demo.core.config.modelMapper.IModelMapperService;
import dev.patika.demo.core.result.ResultData;
import dev.patika.demo.core.utilities.ResultHelper;
import dev.patika.demo.dto.request.category.CategorySaveRequest;
import dev.patika.demo.dto.request.category.CategoryUpdateRequest;
import dev.patika.demo.dto.response.CategoryResponse;
import dev.patika.demo.entity.Category;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IModelMapperService modelMapper;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<CategoryResponse> save(@Valid @RequestBody CategorySaveRequest categorySaveRequest){
        Category saveCategory = this.modelMapper.forRequest().map(categorySaveRequest,Category.class);
        this.categoryService.save(saveCategory);

        CategoryResponse categoryResponse = this.modelMapper.forResponse().map(saveCategory, CategoryResponse.class);
        return ResultHelper.created(categoryResponse);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CategoryResponse> update(@Valid @RequestBody CategoryUpdateRequest categoryUpdateRequest){

        Category updateCategory = this.modelMapper.forRequest().map(categoryUpdateRequest,Category.class);
        this.categoryService.update(updateCategory);

        CategoryResponse categoryResponse = this.modelMapper.forResponse().map(updateCategory,CategoryResponse.class);
        return ResultHelper.success(categoryResponse);
    }

    @GetMapping("/find-all")
    public List<Category> findAll() {
        return this.categoryService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category findById(@PathVariable("id") int id) {
        return this.categoryService.findById(id);
    }





    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@PathVariable("id") int id){
        this.categoryService.delete(id);
        return true;
    }


}
