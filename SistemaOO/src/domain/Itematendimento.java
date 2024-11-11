package domain;

import java.util.ArrayList;

public class Itematendimento {
    //Lista domain.Itematendimento.Itempedido = new Lista();
    ArrayList<Itempedido> itempedido = new ArrayList<Itempedido>();

    public static class Itempedido {
        private Produto produto;
        private int quantidade;

        public Itempedido(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }
        public float calculaSubtotal() {
            return this.produto.getPreco() * quantidade;
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
