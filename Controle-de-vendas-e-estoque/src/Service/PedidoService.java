package Service;

import Entities.Itempedido;
import Entities.Pedido;
import Repository.ClienteRepository;
import Repository.ItempedidoRepository;
import Repository.PedidoRepository;
import Repository.ProdutoRepository;

public class PedidoService {
    private PedidoRepository pr;
    private ItempedidoRepository ir;
    private ClienteRepository cr;
    private ProdutoRepository prr;

    public PedidoService() {
        pr = PedidoRepository.getInstance();
        ir = ItempedidoRepository.getInstance();
        cr = ClienteRepository.getInstance();
        prr = ProdutoRepository.getInstance();
    }
    public long criarPedido(String nomeCliente){
        Pedido pedido = new Pedido();
        cr.getCliente(nomeCliente).addPedido(pedido);

        return pedido.getId();
    }

}
