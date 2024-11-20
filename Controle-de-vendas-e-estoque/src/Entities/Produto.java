package Entities;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class Produto {
    private String nome;
    private float preco;
    private long id;
    private static final AtomicLong contadorId = new AtomicLong(1);

    public Produto(String nome, float preco) {
        this.id = contadorId.incrementAndGet();
        this.nome = nome;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Float.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}
