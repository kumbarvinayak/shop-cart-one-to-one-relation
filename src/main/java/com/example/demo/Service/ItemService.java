package com.example.demo.Service;

import com.example.demo.Model.Item;

import java.util.List;

public interface ItemService {


    Item getItemById(Long id);
    List<Item> getAllItems();

    Item addItem(Item item);

    Item updateItem(Long id, Item item);

    void deleteItem(Long id);


}
