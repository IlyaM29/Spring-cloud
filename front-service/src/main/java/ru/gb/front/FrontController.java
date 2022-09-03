package ru.gb.front;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class FrontController {

    private final FrontService service;

    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return service.getRestTemplate().getForObject("http://product-service/api/v1/products", List.class);
    }
}
