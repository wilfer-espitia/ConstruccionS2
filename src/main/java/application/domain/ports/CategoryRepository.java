package application.domain.ports;

import application.domain.models.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

    Category save(Category category);

    Optional<Category> findById(String id);

    List<Category> findAll();

    void deleteById(String id);
}
