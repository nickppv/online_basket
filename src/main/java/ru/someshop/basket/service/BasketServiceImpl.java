package ru.someshop.basket.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Component
@SessionScope
public class BasketServiceImpl implements BasketService{

    Map<String, Integer> basket = new HashMap<>();

    @Override
    public Map<String, Integer> addProductID(Map<String, String> ids) {
        int len = basket.size();
        List<String> elements = new ArrayList<>(ids.values());
        for (int i = 0; i < ids.size(); i++) {
            basket.put("ID товара №" + (len + i + 1), Integer.parseInt(elements.get(i)));
        }
        return basket;
    }

    @Override
    public Map<String, Integer> getAllProductIDs() {
        return basket;
    }

}
