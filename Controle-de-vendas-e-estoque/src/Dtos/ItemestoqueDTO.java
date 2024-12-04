package Dtos;

public class ItemestoqueDTO {
    private ProdutoDTO produto;
    private int quantidade;

    public ItemestoqueDTO(ProdutoDTO produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public boolean verificaQuantidade() {
        if (quantidade <= 0) {
            return false;
        }
        return true;
    }
}
