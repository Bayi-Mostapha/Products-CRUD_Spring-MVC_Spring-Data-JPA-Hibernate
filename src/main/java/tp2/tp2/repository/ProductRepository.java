package tp2.tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp2.tp2.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
