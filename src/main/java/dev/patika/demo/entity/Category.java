package dev.patika.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id",columnDefinition = "serial")
   private int categoryId;
    @Column(name = "category_name")
   private String categoryName;
    @Column(name = "category_description")
   private String categoryDescription;

    @ManyToMany(mappedBy = "categoryList")
    List<Book> bookList;
}
