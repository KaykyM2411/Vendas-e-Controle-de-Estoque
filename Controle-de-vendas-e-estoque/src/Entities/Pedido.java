package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Pedido {
    private ArrayList<Itempedido> itenspedidos;
    private Cliente cliente;
    private Calendar data;
    private long id;
    private static final AtomicLong contadorId = new AtomicLong(1);

    public Pedido() {
        this.id = contadorId.getAndIncrement();
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data.getTime();
    }
    public void setData(Calendar data) {
        this.data = data;
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

    public ArrayList<Itempedido> getItenspedidos() {
        return itenspedidos;
    }
    
    public void setItenspedidos(ArrayList<Itempedido> itenspedidos) {
        this.itenspedidos = itenspedidos;
    }
    public void addItempedido(Itempedido itempedido) {
        itenspedidos.add(itempedido);
    }
}
