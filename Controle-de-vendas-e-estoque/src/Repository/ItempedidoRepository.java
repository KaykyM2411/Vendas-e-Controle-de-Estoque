package Repository;

import Entities.Itematendimento;
import Entities.Itempedido;
import Entities.Produto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItempedidoRepository {
    private static ItempedidoRepository instance;
    Set<Itempedido> itenspedido = new HashSet<Itempedido>();

    private ItempedidoRepository() {

    }
    public static ItempedidoRepository getInstance() {
        if (instance == null) {
            instance = new ItempedidoRepository();
        }
        return instance;
    }
    public void getUltimo(){

    }
    public Itempedido addItempedido(Produto p, int quantidade) {
        itenspedido.add(new Itempedido(p, quantidade));
        List<Itempedido> lista = new ArrayList<Itempedido>(this.itenspedido);

        return lista.get(lista.size()-1);
    }
    public Set<Itempedido> getItempedido() {
        return itenspedido;
    }
}
