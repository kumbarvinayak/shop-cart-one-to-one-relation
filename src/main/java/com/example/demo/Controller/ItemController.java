package com.example.demo.Controller;

import com.example.demo.Model.Item;
import com.example.demo.Service.ItemService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api/v1")

public class ItemController {
    private  ItemService itemService;

  public ItemController(ItemService itemService) {

       this.itemService = itemService;
   }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable Long id) {
        return itemService.getItemById(id);
    }
    @PostMapping("/items")
    public  Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @PutMapping("/items/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item item) {
        return itemService.updateItem(id, item);
    }
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }

}
