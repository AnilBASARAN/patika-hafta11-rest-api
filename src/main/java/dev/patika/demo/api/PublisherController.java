package dev.patika.demo.api;

import dev.patika.demo.business.abstracts.IPublisherService;
import dev.patika.demo.entity.Category;
import dev.patika.demo.entity.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/publisher")
public class PublisherController {
    @Autowired
    private IPublisherService publisherService;

    @GetMapping("/find-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Publisher> findAll() {
        return this.publisherService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Publisher findById(@PathVariable("id") Long id) {
        return this.publisherService.findById(id);
    }

    @PostMapping()
    public Publisher save(@RequestBody Publisher publisher){

        return this.publisherService.save(publisher);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public Publisher update(@RequestBody Publisher publisher){
        Publisher updatedPublisher =  this.publisherService.update(publisher);
        return updatedPublisher;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@PathVariable("id") Long id){
        this.publisherService.delete(id);
        return true;
    }

}
