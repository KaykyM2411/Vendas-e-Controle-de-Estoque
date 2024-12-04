package Repository;

import Entities.Produto;

import java.util.HashSet;
import java.util.Set;

public class ProdutoRepository {
    private static ProdutoRepository instance;
    Set<Produto> produtos = new HashSet<Produto>();

    private ProdutoRepository() {

    }
    public static ProdutoRepository getInstance() {
        if (instance == null) {
            instance = new ProdutoRepository();
        }
        return instance;
    }
    public Set<Produto> getProdutos() {
        return produtos;
    }
    public Produto getProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        System.out.println("Produto nao encontrado");
        return null;
    }
    public Produto getProduto(int id){
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        System.out.println("Produto nao encontrado");
        return null;
    }
    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
