package Repository;

import Entities.Itemestoque;
import Entities.Produto;

import java.util.HashSet;
import java.util.Set;

public class ItemestoqueRepository {
    private static ItemestoqueRepository instance;
    Set<Itemestoque> itemestoques = new HashSet<Itemestoque>();

    private ItemestoqueRepository() {

    }
    public static ItemestoqueRepository getInstance() {
        if (instance == null) {
            instance = new ItemestoqueRepository();
        }
        return instance;
    }
    public void addItemestoque(Itemestoque itemestoque) {
        itemestoques.add(itemestoque);
    }
    public Set<Itemestoque> getItemestoques() {
        return itemestoques;
    }
    public void addItem(Produto produto, int quantidade) {
        Itemestoque item = new Itemestoque(produto, quantidade);
        itemestoques.add(item);
    }
}
