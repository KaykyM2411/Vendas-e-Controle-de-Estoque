package Entities;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private long id;
    private static final AtomicLong contadorId = new AtomicLong(1);
    private ArrayList<Pedido> pedidos;

    public Cliente(String nome, String telefone, String endereco) {
        this.id = contadorId.getAndIncrement();
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente() {

    }

    public long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
}