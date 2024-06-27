package lt.techin.exam.advertising_app.repository;

import lt.techin.exam.advertising_app.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
