package application.usecases;
import application.domain.models.Category;
import application.domain.services.CategoryService;
import java.util.List;
import java.util.Optional;

public class CategoryUseCases {
    private final CategoryService categoryService;

    public CategoryUseCases(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public Category saveCategory(Category category) {
        return categoryService.save(category);
    }

    public Optional<Category> findCategoryById(String id) {
        return categoryService.findById(id);
    }

    public List<Category> findAllCategories() {
        return categoryService.findAll();
    }

    public void deleteCategory(String id) {
        categoryService.deleteById(id);
    }
}