package Repository;

import Entities.Estoque;
import Entities.Itemestoque;

public class EstoqueRepository {
    private static EstoqueRepository instance;
    private Estoque estoque;

    private EstoqueRepository() {

    }
    public static EstoqueRepository getInstance() {
        if (instance == null) {
            instance = new EstoqueRepository();
        }
        return instance;
    }
    public Estoque getEstoque() {
        return this.estoque;
    }
    public void addEstoque(Itemestoque produto) {
        estoque.addProdutos(produto);
    }
    public void attEstoque(Itemestoque produto, int quantidade) {
        //Implementar lógica para atualizar a quantidade de um produto no estoque
    }
    public void removeEstoque(String produto) {
        ItemestoqueRepository itens = ItemestoqueRepository.getInstance();

        for (Itemestoque item : itens.getItemestoques() ){
            if (item.getProduto().equals(produto)){
                itens.itemestoques.remove(item);
            }else {
                System.out.println("PRODUTO NÃO ENCONTRADO!");
            }
        }
    }
}
