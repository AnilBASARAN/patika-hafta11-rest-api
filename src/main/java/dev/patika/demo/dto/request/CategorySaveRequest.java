package dev.patika.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategorySaveRequest {
    private int id;
    private String categoryName;
    private String categoryDescription;
}