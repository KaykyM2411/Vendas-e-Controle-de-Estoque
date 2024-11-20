package Repository;

import Entities.Pedido;

import java.util.HashSet;
import java.util.Set;

public class PedidoRepository {
    private static PedidoRepository instance;
    Set<Pedido> pedidos = new HashSet<Pedido>();

    private PedidoRepository() {

    }
    public static PedidoRepository getInstance() {
        if (instance == null) {
            instance = new PedidoRepository();
        }
        return instance;
    }
    public Set<Pedido> getPedido() {
        return pedidos;
    }
    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}
