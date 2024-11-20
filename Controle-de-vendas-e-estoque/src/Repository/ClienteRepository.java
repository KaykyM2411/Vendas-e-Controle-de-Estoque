package Repository;

import Entities.Cliente;

import java.util.HashSet;
import java.util.Set;

public class ClienteRepository {
    private static ClienteRepository instance;
    Set<Cliente> clientes = new HashSet<Cliente>();

    private ClienteRepository() {

    }
    public static ClienteRepository getInstance() {
        if (instance == null) {
            instance = new ClienteRepository();
        }
        return instance;
    }
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public Set<Cliente> getClientes() {
        return clientes;
    }
    public Cliente getCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }
    public void removeCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
}
