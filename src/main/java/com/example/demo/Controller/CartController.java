package com.example.demo.Controller;

import com.example.demo.Model.Item;
import com.example.demo.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("api/v1")


public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/carts")
    public ResponseEntity<List<Item>> getAllCarts() {
        List<Item> carts = cartService.getAllCarts();
        return ResponseEntity.ok(carts);
    }

    @GetMapping("/carts/{id}")
    public ResponseEntity<Item> getCartById(@PathVariable Long id) {
        Optional<Item> cart = cartService.getCartById(id);
        return cart.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }



}
