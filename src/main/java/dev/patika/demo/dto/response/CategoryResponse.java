package dev.patika.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoryResponse {
   private int id;
   private String categoryName;
   private String categoryDescription;
}
