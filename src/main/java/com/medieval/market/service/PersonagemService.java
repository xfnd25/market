package com.medieval.market.service;

import com.medieval.market.model.Personagem;
import com.medieval.market.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository personagemRepository;

    public Personagem savePersonagem(Personagem personagem) {
        return personagemRepository.save(personagem);
    }

    public List<Personagem> getAllPersonagens() {
        return personagemRepository.findAll();
    }

    public Personagem getPersonagemByNome(String nome) {
        return personagemRepository.findByNome(nome);
    }

    public Personagem getPersonagemByClasse(String classe) {
        return personagemRepository.findByClasse(classe);
    }
}
