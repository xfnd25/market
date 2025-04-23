package com.medieval.market.repository;

import com.medieval.market.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
    Personagem findByNome(String nome);
    Personagem findByClasse(String classe);
}
