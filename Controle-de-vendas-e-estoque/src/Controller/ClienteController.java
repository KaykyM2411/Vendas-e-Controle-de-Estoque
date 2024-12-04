package Controller;

import Dtos.ClienteDTO;
import Entities.Cliente;
import Service.ClienteService;

public class ClienteController {
    private ClienteService cs;

    public ClienteController() {
        cs = new ClienteService();
    }

    public void addCliente(String nome, String telefone, String endereco){
        ClienteDTO cliente = new ClienteDTO(nome, telefone, endereco, 0);
        if(!cliente.verificaDados()){
            System.out.println("Erro ao adicionar cliente");
            return;
        }
        cs.addCliente(nome, telefone, endereco);
    }
    public void pedidosCliente(String nome){
        ClienteDTO cliente = new ClienteDTO(nome, " ", " ", 0);
        if(!cliente.verificaNome()){
            System.out.println("Nome inválido");
            return;
        }
        cs.pedidosCliente(nome);
    }
    public void pedidosCliente(int id){
        ClienteDTO cliente = new ClienteDTO(" ", " ", " ", id);
        if(!cliente.verificaId()){
            System.out.println("Id inválido");
            return;
        }
        cs.pedidosCliente(id);
    }
    public void atualizarDados(String nomeantigo,String nomenovo, String telefonenovo, String endereconovo){
        ClienteDTO cliente = new ClienteDTO(nomenovo, nomenovo, telefonenovo, 0);
        if(!cliente.verificaDados()){
            System.out.println("Erro ao atualizar cliente");
            return;
        }
        cs.atualizarDados(nomeantigo, nomenovo, telefonenovo, endereconovo);
    }
    public void atualizarDados(int id, String nomenovo, String telefonenovo, String endereconovo){
        ClienteDTO cliente = new ClienteDTO(nomenovo, nomenovo, telefonenovo, id);
        if(!cliente.verificaId()){
            System.out.println("Erro ao atualizar cliente");
            return;
        }
        cs.atualizarDados(id, nomenovo, telefonenovo, endereconovo);
    }
}
