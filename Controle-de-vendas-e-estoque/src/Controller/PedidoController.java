package Controller;

import Dtos.PedidoDTO;
import Service.PedidoService;

public class PedidoController {
    private PedidoService ps;
    public PedidoController() {ps = new PedidoService(); }

    public long criarPedido(String nome){
        PedidoDTO pedido = new PedidoDTO(0 , null, nome);
        if (pedido.verificaNome()){
           return ps.criarPedido(nome);
        }
        return 0;
    }
    public long criarPedido(int id){
        PedidoDTO pedido = new PedidoDTO(id , null, " ");
        if (pedido.verificaId()){
            return ps.criarPedido(id);
        }
        return 0;
    }
}
