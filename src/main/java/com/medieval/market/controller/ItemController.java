package com.medieval.market.controller;

import com.medieval.market.model.Item;
import com.medieval.market.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/nome/{nome}")
    public List<Item> getItemsByNome(@PathVariable String nome) {
        return itemService.findItemsByNome(nome);
    }

    @GetMapping("/tipo/{tipo}")
    public List<Item> getItemsByTipo(@PathVariable String tipo) {
        return itemService.findItemsByTipo(tipo);
    }

    @GetMapping("/preco")
    public List<Item> getItemsByPreco(@RequestParam double min, @RequestParam double max) {
        return itemService.findItemsByPreco(min, max);
    }

    @GetMapping("/raridade/{raridade}")
    public List<Item> getItemsByRaridade(@PathVariable String raridade) {
        return itemService.findItemsByRaridade(raridade);
    }
}
