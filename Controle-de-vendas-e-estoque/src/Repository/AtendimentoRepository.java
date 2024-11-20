package Repository;

import Entities.Atendimento;

import java.util.HashSet;
import java.util.Set;

public class AtendimentoRepository {
    private static AtendimentoRepository instance;
    Set<Atendimento> atendimentos = new HashSet<Atendimento>();

    private AtendimentoRepository() {

    }
    public static AtendimentoRepository getInstance() {
        if (instance == null) {
            instance = new AtendimentoRepository();
        }
        return instance;
    }
    public void addAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }
    public Set<Atendimento> getAtendimentos() {
        return atendimentos;
    }
    public void removeAtendimento(Atendimento atendimento) {
        atendimentos.remove(atendimento);
    }
}
