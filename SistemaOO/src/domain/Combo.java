package domain;

import java.util.ArrayList;

public class Combo extends Produto {
    //Lista produto = new Lista();
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Combo(String nome, float preco) {
        super(nome, preco);
    }
}
