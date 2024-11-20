package Dtos;

import Entities.Cliente;

public class ClienteDTO {
    private String nome;
    private String telefone;
    private String endereco;
    private long id;

    public ClienteDTO(String nome, String telefone, String endereco, long id) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.id = id;
    }
    public ClienteDTO(ClienteDTO clienteDTO) {
        this.nome = clienteDTO.getNome();
        this.telefone = clienteDTO.getTelefone();
        this.endereco = clienteDTO.getEndereco();
        this.id = clienteDTO.getId();
    }
    public ClienteDTO(Cliente cliente) {
        this.nome = cliente.getNome();
        this.telefone = cliente.getTelefone();
        this.endereco = cliente.getEndereco();
        this.id = cliente.getId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public boolean verifica() {
        if (this.nome == " " || this.nome == null) {
            return false;
        }
        if (this.telefone == " " || this.telefone == null) {
            return false;
        }
        if (this.endereco == " " || this.endereco == null) {
            return false;
        }
        return true;
    }
}