package lt.techin.exam.advertising_app.repository;

import lt.techin.exam.advertising_app.model.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertRepository extends JpaRepository<Advert, Long> {
}
