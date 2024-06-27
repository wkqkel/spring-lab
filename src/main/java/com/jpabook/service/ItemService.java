package com.jpabook.service;

import com.jpabook.domain.item.Item;
import com.jpabook.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemService {
    private final ItemRepository itemRepository;

    @Transactional
    public Item saveItem(Item item) {
        this.itemRepository.save(item);
    }

    public List<Item> findItems() {
        return this.itemRepository.findAll();
    }

    public Item findOne(Long id) {
        return this.itemRepository.findOne(id);
    }
}
