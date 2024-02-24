package dev.patika.demo.dto.request.category;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryUpdateRequest {
    @Positive(message = "ID değeri pozitif sayı olmak zorunda")
    private int id;
    private String categoryName;
    private String categoryDescription;
}
