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

    public PedidoRepository getPr() {
        return pr;
    }

    public void setPr(PedidoRepository pr) {
        this.pr = pr;
    }

    public ItempedidoRepository getIr() {
        return ir;
    }

    public void setIr(ItempedidoRepository ir) {
        this.ir = ir;
    }

    public ClienteRepository getCr() {
        return cr;
    }

    public void setCr(ClienteRepository cr) {
        this.cr = cr;
    }

    public ProdutoRepository getPrr() {
        return prr;
    }

    public void setPrr(ProdutoRepository prr) {
        this.prr = prr;
    }

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
    public long criarPedido(int id){
        Pedido pedido = new Pedido();
        cr.getCliente(id).addPedido(pedido);

        return pedido.getId();
    }
    public void
}
