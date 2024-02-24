package dev.patika.demo.business.abstracts;

import dev.patika.demo.entity.Publisher;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IPublisherService {
    public Publisher get(Long id);
    public boolean delete(Long id);
    Publisher save(Publisher publisher);
    String delete(Publisher publisher);
    Publisher findById(Long id);
    List<Publisher> findAll();
    Publisher update(Publisher publisher);
}
