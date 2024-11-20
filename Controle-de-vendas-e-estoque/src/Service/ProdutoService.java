package Service;

import Entities.Itemestoque;
import Entities.Produto;
import Repository.ItemestoqueRepository;
import Repository.ProdutoRepository;

public class ProdutoService {
    private ProdutoRepository pr;
    private ItemestoqueRepository ir;

    public ProdutoService() {
        pr = ProdutoRepository.getInstance();
        ir = ItemestoqueRepository.getInstance();
    }
    public void cadastrarProduto(String nome, float preco) {
        Produto produto = new Produto(nome, preco);
        pr.addProduto(produto);
        ir.addItem(pr.getProduto(nome), 0);

    }
    public Produto buscarProduto(String nome) {
        return pr.getProduto(nome);
    }
}
