package Service;

import Entities.Estoque;
import Entities.Itemestoque;
import Repository.EstoqueRepository;
import Repository.ItemestoqueRepository;

public class EstoqueService {
    private EstoqueRepository er;
    private ItemestoqueRepository ir;
    public EstoqueService() {
        er = EstoqueRepository.getInstance();
        ir = ItemestoqueRepository.getInstance();
    }
    public Itemestoque getItemestoque(int id) {
        return ir.getItemestoque(id);
    }
    public Itemestoque getItemestoque(String nome) {
        return ir.getItemestoque(nome);
    }
    public void attEstoque(int id, int quantidade) {
        ir.getItemestoque(id).setQuantidade(quantidade);
    }
    public void attEstoque(String nome, int quantidade) {
        ir.getItemestoque(nome).setQuantidade(quantidade);
    }
    public void removerEstoque(int id) {
        ir.getItemestoque().remove(ir.getItemestoque(id));
    }
    public void removerEstoque(String nome) {
        ir.getItemestoque().remove(ir.getItemestoque(nome));
    }
}
