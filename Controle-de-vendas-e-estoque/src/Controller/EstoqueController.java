package Controller;

import Dtos.ItemestoqueDTO;
import Dtos.ProdutoDTO;
import Entities.Itemestoque;
import Service.EstoqueService;
import Service.ProdutoService;

public class EstoqueController {
    private EstoqueService estoque;

    public EstoqueController() {
        estoque = new EstoqueService();
    }

    public EstoqueService getEstoque() {
        return estoque;
    }

    public void setEstoque(EstoqueService estoque) {
        this.estoque = estoque;
    }
    public Itemestoque getItemestoque(int id) {
        ProdutoDTO produto = new ProdutoDTO(" ", 0, id);

        if (!produto.verificaId()){
            System.out.println("Id inválido");
            return null;
        }
        return estoque.getItemestoque(id);
    }
    public Itemestoque getItemestoque(String nome) {
        ProdutoDTO produto = new ProdutoDTO(nome, 0, 0);
        if (!produto.verificaNome()){
            System.out.println("Nome inválido");
            return null;
        }
        return estoque.getItemestoque(nome);
    }
    public void attEstoque(int id, int quantidade) {
        ProdutoDTO produto = new ProdutoDTO(" ", 0, id);
        ItemestoqueDTO itemestoque = new ItemestoqueDTO(produto, quantidade);

        if (!itemestoque.getProduto().verificaId() || !itemestoque.verificaQuantidade()){
            System.out.println("Id ou quantidade inválidos");
            return;
        }
        estoque.attEstoque(id, quantidade);
    }
    public void attEstoque(String nome, int quantidade) {
        ProdutoDTO produto = new ProdutoDTO(nome, 0, 0);
        ItemestoqueDTO itemestoque = new ItemestoqueDTO(produto, quantidade);
        if (!itemestoque.getProduto().verificaNome() || !itemestoque.verificaQuantidade()){
            System.out.println("Nome ou quantidade inválidos");
            return;
        }
        estoque.attEstoque(nome, quantidade);
    }
    public void removerItemestoque(int id) {
        ProdutoDTO produto = new ProdutoDTO(" ", 0, id);

        if (!produto.verificaId()){
            System.out.println("Id inválido");
            return;
        }
        estoque.removerEstoque(id);
    }
    public void removerItemestoque(String nome) {
        ProdutoDTO produto = new ProdutoDTO(nome, 0, 0);

        if (!produto.verificaNome()){
            System.out.println("Nome inválido");
            return;
        }
        estoque.removerEstoque(nome);
    }
}
