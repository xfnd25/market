package com.medieval.market.dto;

import com.medieval.market.model.Raridade;
import com.medieval.market.model.TipoItem;

public class ItemDTO {

    public String nome;
    public TipoItem tipo;
    public Raridade raridade;
    public double preco;
    public Long donoId;
}
