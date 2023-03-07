package com.example.demo.Service;

import com.example.demo.Model.Item;

import java.util.List;
import java.util.Optional;

public interface CartService {

    public List<Item> getAllCarts();
    public Optional<Item> getCartById(Long id);
    void deleteCart(Long id);



}
