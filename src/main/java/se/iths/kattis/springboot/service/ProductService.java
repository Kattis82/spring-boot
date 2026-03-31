package se.iths.kattis.springboot.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.springboot.Repository.ProductRepository;
import se.iths.kattis.springboot.model.Product;

import java.util.List;


@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
