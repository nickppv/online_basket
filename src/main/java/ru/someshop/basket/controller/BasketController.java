package ru.someshop.basket.controller;

import org.springframework.web.bind.annotation.*;
import ru.someshop.basket.service.BasketService;

import java.util.Map;

@RestController
@RequestMapping(path = "/store/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping
    public String welcome() {
        return "Welcome to the Basket";
    }

    @GetMapping(path = "/add")
    public Map<String, Integer> addProduct(@RequestParam Map<String, String> params) {
        return basketService.addProductID(params);
    }

    @GetMapping(path = "/get")
    public Map<String, Integer> getProduct() {
        return basketService.getAllProductIDs();
    }

}
