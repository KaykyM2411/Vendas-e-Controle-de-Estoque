package Entities;

import java.util.ArrayList;

public class Itematendimento {
    ArrayList<Itempedido> itempedido = new ArrayList<Itempedido>();

    public static class Itempedido {
        private Produto produto;
        private int quantidade;

        public Itempedido(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }
        public Produto getProduto() {
            return produto;
        }

        public void setProduto(Produto produto) {
            this.produto = produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }
}

