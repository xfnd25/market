package com.medieval.market.repository;

import com.medieval.market.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByNomeContaining(String nome);
    List<Item> findByTipo(String tipo);
    List<Item> findByPrecoBetween(double min, double max);
    List<Item> findByRaridade(String raridade);
}
