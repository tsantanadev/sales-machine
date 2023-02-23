package br.com.tsantana.salesmachine.controller;

import br.com.tsantana.salesmachine.model.Product;
import br.com.tsantana.salesmachine.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product save(@RequestBody final Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return service.findAll();
    }
}
