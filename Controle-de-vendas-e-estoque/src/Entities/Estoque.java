package Entities;

import java.util.HashSet;
import java.util.Set;

public class Estoque {
    private Set<Itemestoque> produtos = new HashSet<Itemestoque>();

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void addProdutos(Itemestoque produto) {
        this.produtos.add(produto);
    }
}
