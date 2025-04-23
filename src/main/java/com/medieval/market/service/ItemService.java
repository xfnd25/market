package com.medieval.market.service;

import com.medieval.market.model.Item;
import com.medieval.market.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public List<Item> findItemsByNome(String nome) {
        return itemRepository.findByNomeContaining(nome);
    }

    public List<Item> findItemsByTipo(String tipo) {
        return itemRepository.findByTipo(tipo);
    }

    public List<Item> findItemsByPreco(double min, double max) {
        return itemRepository.findByPrecoBetween(min, max);
    }

    public List<Item> findItemsByRaridade(String raridade) {
        return itemRepository.findByRaridade(raridade);
    }
}
