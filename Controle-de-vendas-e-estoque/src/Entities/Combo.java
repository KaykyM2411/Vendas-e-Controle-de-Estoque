package Entities;

import java.util.HashSet;
import java.util.Set;

public class Combo extends Produto {
   private Set<Produto> produtos = new HashSet<Produto>();

    public Combo(String nome, float preco) {
        super(nome, preco);
    }
}
