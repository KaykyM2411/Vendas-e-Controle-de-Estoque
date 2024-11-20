package Dtos;

import Entities.Pedido;

import java.util.Date;


public class PedidoDTO {
    private long id;
    private Date data;
    private ClienteDTO cliente;

    public PedidoDTO(long id, Date data, ClienteDTO cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }
    public PedidoDTO(PedidoDTO pedido) {
        this.id = pedido.getId();
        this.data = pedido.getData();
        this.cliente = pedido.getCliente();
    }
    public PedidoDTO(Pedido pedido) {
        this.id = pedido.getId();
        this.data = pedido.getData();
        this.cliente.setNome(pedido.getCliente().getNome());
        this.cliente.setEndereco(pedido.getCliente().getEndereco());
        this.cliente.setTelefone(pedido.getCliente().getTelefone());
        this.cliente.setId(pedido.getCliente().getId());

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }
}
