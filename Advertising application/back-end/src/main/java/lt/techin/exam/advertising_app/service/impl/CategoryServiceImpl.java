package lt.techin.exam.advertising_app.service.impl;

import lombok.AllArgsConstructor;
import lt.techin.exam.advertising_app.dto.CategoryDto;
import lt.techin.exam.advertising_app.exception.ResourceNotFoundException;
import lt.techin.exam.advertising_app.mapper.CategoryMapper;
import lt.techin.exam.advertising_app.model.Category;
import lt.techin.exam.advertising_app.repository.CategoryRepository;
import lt.techin.exam.advertising_app.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private CategoryRepository categoryRepository;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {

        Category category = CategoryMapper.mapToCategory(categoryDto);
        Category savedCategory = categoryRepository.save(category);

        return CategoryMapper.mapToCategoryDto(savedCategory);
    }

    @Override
    public CategoryDto getCategoryById(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(
                () -> new ResourceNotFoundException("Category do not exists with a given id: " + categoryId)
        );
        return CategoryMapper.mapToCategoryDto(category);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(CategoryMapper::mapToCategoryDto)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto updateCategory(Long categoryId, CategoryDto updatedCategory) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(
                () -> new ResourceNotFoundException("Category do not exists with a given id: " + categoryId)
        );

        category.setCategoryName(updatedCategory.getCategoryName());

        Category savedCategory = categoryRepository.save(category);

        return CategoryMapper.mapToCategoryDto(savedCategory);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.findById(categoryId).orElseThrow(
                () -> new ResourceNotFoundException("Category do not exists with a given id: " + categoryId)
        );

        categoryRepository.deleteById(categoryId);

    }
}
