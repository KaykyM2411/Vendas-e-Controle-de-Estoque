package Dtos;

import Entities.Pedido;

import java.util.Date;


public class PedidoDTO {
    private long id;
    private Date data;
    private String cliente;

    public PedidoDTO(long id, Date data, String cliente) {
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
        this.setCliente(pedido.getCliente().getNome());
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public boolean verificaNome(){
        ClienteDTO cliente = new ClienteDTO(this.cliente, " "," ", 0);

        return cliente.verificaNome();
    }
    public boolean verificaId(){
        ClienteDTO cliente = new ClienteDTO("", " ", " ", this.id);

        return cliente.verificaId();
    }
}

