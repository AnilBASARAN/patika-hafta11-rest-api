package dev.patika.demo.dao;

import dev.patika.demo.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPublisherRepo extends JpaRepository<Publisher,Long> {
}
