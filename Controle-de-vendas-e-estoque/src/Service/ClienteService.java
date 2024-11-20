package Service;

import Entities.Cliente;
import Entities.Itempedido;
import Entities.Pedido;
import Repository.ClienteRepository;
import Repository.ItempedidoRepository;
import Repository.PedidoRepository;
import Repository.ProdutoRepository;

public class ClienteService {
    private ClienteRepository cr;
    private PedidoRepository pr;
    private ItempedidoRepository ir;
    private ProdutoRepository prr;

    public ClienteService() {
        cr = ClienteRepository.getInstance();
        pr = PedidoRepository.getInstance();
        ir = ItempedidoRepository.getInstance();
        prr = ProdutoRepository.getInstance();
    }

    public void addCliente(String nome, String telefone, String endereco) {
        Cliente cliente = new Cliente(nome, telefone, endereco);
        this.cr.addCliente(cliente);
    }
    public void pedidosCliente(String nome){
        Cliente cliente = this.cr.getCliente(nome);
        for (Pedido pedido : cliente.getPedidos()) {
            System.out.println(pedido.getData() + " " + pedido.getId());
        }
    }
    public void atualizarDados(String nomeantigo,String nomenovo, String telefonenovo, String endereconovo){
        Cliente cliente = this.cr.getCliente(nomeantigo);
        cliente.setNome(nomenovo);
        cliente.setTelefone(telefonenovo);
        cliente.setEndereco(endereconovo);
    }
    public Pedido localizarPedido(long idPedido, String nome){
        for (Pedido pedido : cr.getCliente(nome).getPedidos() ) {
            if (pedido.getId() == idPedido) {
                return pedido;
            }
        }
        return null;
    }
    public void addPedido(String nomeCliente, long idPedido, String nomeProduto, int quantidade){
        Itempedido item = ir.addItempedido(prr.getProduto(nomeProduto), quantidade);

        this.localizarPedido(idPedido, nomeCliente).addItempedido(item);
    }
}
