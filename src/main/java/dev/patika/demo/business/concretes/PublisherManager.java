package dev.patika.demo.business.concretes;

import dev.patika.demo.business.abstracts.IPublisherService;
import dev.patika.demo.dao.IPublisherRepo;
import dev.patika.demo.entity.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PublisherManager implements IPublisherService {

    @Autowired
    private IPublisherRepo publisherRepo;
    @Override
    public Publisher get(Long id) {
        return this.publisherRepo.findById(id).orElseThrow();
    }

    @Override
    public boolean delete(Long id) {
        Publisher publisher = this.get(id);
        this.publisherRepo.delete(publisher);
        return true;
    }

    @Override
    public Publisher save(Publisher publisher) {
        return this.publisherRepo.save(publisher);
    }

    @Override
    public String delete(Publisher publisher) {
        this.publisherRepo.delete(publisher);
        return publisher.getPublisherId()+"id li yayıncı silindi";
    }

    @Override
    public Publisher findById(Long id) {
        return this.publisherRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Publisher> findAll() {
        return this.publisherRepo.findAll();
    }

    @Override
    public Publisher update(Publisher publisher) {
        return this.publisherRepo.save(publisher);
    }
}
