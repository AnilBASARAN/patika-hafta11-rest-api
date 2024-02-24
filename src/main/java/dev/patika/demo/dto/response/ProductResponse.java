package dev.patika.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private int id;

    private String name;

    private int stock;

    private double price;

    private int supplierId;
    private int categoryId;
}
