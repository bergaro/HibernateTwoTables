package ru.netology.layerdao.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.layerdao.entities.Order;
import ru.netology.layerdao.repository.AppRepository;
import java.util.List;

@RestController
public class AppController {

    private AppRepository appRepository;

    public AppController(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<Order> getCustomerProduct(@RequestParam("name") String name) {
        return appRepository.getProductName(name);
    }
}
