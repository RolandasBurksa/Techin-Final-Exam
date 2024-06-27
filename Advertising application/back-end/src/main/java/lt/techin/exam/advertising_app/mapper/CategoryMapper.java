package lt.techin.exam.advertising_app.mapper;

import lt.techin.exam.advertising_app.dto.CategoryDto;
import lt.techin.exam.advertising_app.model.Category;

public class CategoryMapper {

    public static CategoryDto mapToCategoryDto(Category category){
        return new CategoryDto(category.getId(), category.getCategoryName());
    }

    public static Category mapToCategory(CategoryDto categoryDto){
        return new Category(categoryDto.getId(), categoryDto.getCategoryName());
    }
}
