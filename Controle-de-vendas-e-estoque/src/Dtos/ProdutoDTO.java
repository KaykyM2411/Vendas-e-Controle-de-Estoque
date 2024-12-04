package Dtos;

import Entities.Produto;

public class ProdutoDTO {
    private String nome;
    private float preco;
    private long id;

    public ProdutoDTO(String nome, float preco, long id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }
    public ProdutoDTO(ProdutoDTO produto) {
        this.nome = produto.nome;
        this.preco = produto.preco;
        this.id = produto.id;
    }
    public ProdutoDTO(Produto produto) {
        this.nome = produto.getNome();
        this.preco = produto.getPreco();
        this.id = produto.getId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean verificaNome(){
        if(this.nome.isBlank() || this.nome == null) {
            return false;
        }
        return true;
    }
    public boolean verificaPreco(){
        if(this.preco <= 0) {
            return false;
        }
        return true;
    }
    public boolean verificaId(){
        if(this.id <= 0) {
            return false;
        }
        return true;
    }
    public boolean verificaProduto(){
        if (!verificaNome() || !verificaPreco() || !verificaId()) {
            return false;
        }
        return true;
    }
}
