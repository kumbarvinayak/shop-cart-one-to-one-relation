package com.example.demo.Service;

import com.example.demo.Model.Item;
import com.example.demo.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;


    @Override
    public List<Item> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public Optional<Item> getCartById(Long id) {
        return cartRepository.findById(id);
    }


    @Override
    public void deleteCart(Long id) {
        cartRepository.deleteById(id);

    }


    }





