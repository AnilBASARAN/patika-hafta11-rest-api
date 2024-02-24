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
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private Long publisherId;
    private String publisherName;
    private int publisherEstablishmentYear;
    private String publisherAdress;

    @OneToMany(mappedBy = "publisher")
    private List<Book> bookList;
}
