package com.medieval.market.controller;

import com.medieval.market.model.Personagem;
import com.medieval.market.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @PostMapping
    public Personagem createPersonagem(@RequestBody Personagem personagem) {
        return personagemService.savePersonagem(personagem);
    }

    @GetMapping
    public List<Personagem> getAllPersonagens() {
        return personagemService.getAllPersonagens();
    }

    @GetMapping("/nome/{nome}")
    public Personagem getPersonagemByNome(@PathVariable String nome) {
        return personagemService.getPersonagemByNome(nome);
    }

    @GetMapping("/classe/{classe}")
    public Personagem getPersonagemByClasse(@PathVariable String classe) {
        return personagemService.getPersonagemByClasse(classe);
    }
}
