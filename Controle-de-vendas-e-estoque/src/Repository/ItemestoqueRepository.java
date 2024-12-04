package Repository;

import Entities.Itemestoque;
import Entities.Produto;

import java.util.HashSet;
import java.util.Set;

public class ItemestoqueRepository {
    private static ItemestoqueRepository instance;
    private Set<Itemestoque> itemestoques = new HashSet<Itemestoque>();

    private ItemestoqueRepository() {

    }
    public static ItemestoqueRepository getInstance() {
        if (instance == null) {
            instance = new ItemestoqueRepository();
        }
        return instance;
    }
    public Set<Itemestoque> getItemestoque() {
        return this.itemestoques;
    }
    public void setItemestoques(Set<Itemestoque> itemestoques) {
        this.itemestoques = itemestoques;
    }

    public void addItemestoque(Itemestoque itemestoque) {
        itemestoques.add(itemestoque);
    }
    public Set<Itemestoque> getItemestoques() {
        return itemestoques;
    }
    public Itemestoque getItemestoque(int id) {
        for (Itemestoque item : itemestoques) {
            if (item.getProduto().getId() == id) {
                return item;
            }
        }
        System.out.println("Item não encontrado");
        return null;
    }
    public Itemestoque getItemestoque(String nome) {
        for (Itemestoque item : itemestoques) {
            if (item.getProduto().getNome().equals(nome)) {
                return item;
            }
        }
        System.out.println("Item não encontrado");
        return null;
    }
    public void addItem(Produto produto, int quantidade) {
        Itemestoque item = new Itemestoque(produto, quantidade);
        itemestoques.add(item);
        EstoqueRepository.getInstance().addEstoque(item);
    }
}
