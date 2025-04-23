package com.medieval.market.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClassePersonagem classe;

    @Column(nullable = false)
    private int nivel;

    @Column(nullable = false)
    private double moedas;

    @OneToMany(mappedBy = "dono", cascade = CascadeType.ALL)
    private List<Item> itens;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClassePersonagem getClasse() {
        return classe;
    }

    public void setClasse(ClassePersonagem classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1 || nivel > 99) {
            throw new IllegalArgumentException("Nível deve ser entre 1 e 99");
        }
        this.nivel = nivel;
    }

    public double getMoedas() {
        return moedas;
    }

    public void setMoedas(double moedas) {
        this.moedas = moedas;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
