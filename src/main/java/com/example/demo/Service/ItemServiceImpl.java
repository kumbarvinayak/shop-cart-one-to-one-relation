package com.example.demo.Service;

import aj.org.objectweb.asm.ConstantDynamic;
import com.example.demo.Exception.ItemNotFoundException;
import com.example.demo.Model.Item;
import com.example.demo.Repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemServiceImpl implements ItemService {


    private ItemRepository itemRepository;
    private ConstantDynamic newItem;

    public ItemServiceImpl(ItemRepository itemRepository) {

         this.itemRepository = itemRepository;
    }


    @Override
    public Item getItemById(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("Item not found with id : " + id));

    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(Long id, Item item) {
        return itemRepository.findById(id)
                .map(item1 -> {
                    item.setName(newItem.getName());
                    item.setPrice((double) newItem.getSize());
                    return itemRepository.save(item);
                })
                .orElseThrow(() -> new ItemNotFoundException("Item not found with id : " + id));

    }

    @Override
    public void deleteItem(Long id) {

        itemRepository.deleteById(id);


    }
}
