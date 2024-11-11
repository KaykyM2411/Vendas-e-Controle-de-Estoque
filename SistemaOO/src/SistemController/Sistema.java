package SistemController;

import domain.Atendimento;
import domain.Cliente;
import domain.Pedido;
import domain.Produto;

import java.util.ArrayList;

public class Sistema {
    private static Sistema instance;
    private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Atendimento> atendimentos;

    private Sistema() {
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
        pedidos = new ArrayList<>();
        atendimentos = new ArrayList<>();
    }
    public static Sistema getInstance() {
        if (instance == null) {
            synchronized (Sistema.class) {
                if (instance == null) {
                    instance = new Sistema();
                }
            }
        }
        return instance;
    }
    public void init(ArrayList<Cliente> clientes, ArrayList<Produto> produtos, ArrayList<Pedido> pedidos, ArrayList<Atendimento> atendimentos) {

        this.clientes.addAll(clientes);
        this.produtos.addAll(produtos);
        this.pedidos.addAll(pedidos);
        this.atendimentos.addAll(atendimentos);
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}
