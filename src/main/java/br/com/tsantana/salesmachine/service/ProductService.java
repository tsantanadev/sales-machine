package br.com.tsantana.salesmachine.service;

import br.com.tsantana.salesmachine.model.Product;
import br.com.tsantana.salesmachine.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product save(final Product product) {
        return repository.save(product);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }
}
