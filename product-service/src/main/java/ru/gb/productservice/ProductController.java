package ru.gb.productservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
//@CrossOrigin("http://localhost:3000") // Homework: *
public class ProductController {
    private final ProductService productService;

    private static final Function<Product, ProductDto> mapper = p -> new ProductDto(p.getId(), p.getTitle(), p.getPrice());

    @GetMapping("/products")
    public List<ProductDto> findAll() {
        return productService.findAll().stream().map(mapper).collect(Collectors.toList());
    }
}
