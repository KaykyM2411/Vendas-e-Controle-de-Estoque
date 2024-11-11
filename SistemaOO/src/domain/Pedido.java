package domain;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Itematendimento.Itempedido> itenspedidos;
    private Cliente cliente;

    public void addItempedido(Itematendimento.Itempedido item) {
        itenspedidos.add(item);
    }
    public float calculaTotal() {
        float total = 0;
        for (Itematendimento.Itempedido item : itenspedidos) {
            total += item.calculaSubtotal();
        }
        return total;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ArrayList<Itematendimento.Itempedido> getItempedidos() {
        return itenspedidos;
    }
}
