package se.iths.kattis.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.iths.kattis.springboot.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();

}


