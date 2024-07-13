package ru.someshop.basket.service;

import java.util.Map;

public interface BasketService {

    Map<String, Integer> addProductID(Map<String, String> ids);

    Map<String, Integer> getAllProductIDs();
}
