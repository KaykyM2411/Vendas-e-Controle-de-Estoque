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
        ClienteDTO cliente = new ClienteDTO(nome, telefone, endereco);
        if(!cliente.verificaDados()){
            System.out.println("Erro ao adicionar cliente");
            return;
        }
        cs.addCliente(nome, telefone, endereco);
    }
    public void pedidosCliente(String nome){
        ClienteDTO cliente = new ClienteDTO(nome, " ", " ");
        if(!cliente.verificaNome()){
            System.out.println("Nome inválido");
            return;
        }
        cs.pedidosCliente(nome);
    }
    public void atualizarDados(String nomeantigo,String nomenovo, String telefonenovo, String endereconovo){
        ClienteDTO clinte = new ClienteDTO(nomenovo, nomenovo, telefonenovo);
        if(!clinte.verificaDados()){
            System.out.println("Erro ao atualizar cliente");
            return;
        }
        cs.atualizarDados(nomeantigo, nomenovo, telefonenovo, endereconovo);
    }
}
