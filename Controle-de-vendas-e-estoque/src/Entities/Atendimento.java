package Entities;

import java.util.ArrayList;

public class Atendimento {
    private ArrayList<Itematendimento> itematendimento = new ArrayList<Itematendimento>();

    public void addItemAtendimento(Itematendimento itematendimento) {
        this.itematendimento.add(itematendimento);
    }
    public ArrayList<Itematendimento> getItematendimento() {
        return itematendimento;
    }
}