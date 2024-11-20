package Repository;

import Entities.Itematendimento;

import java.util.HashSet;
import java.util.Set;

public class ItematendimentoRepository {
    private static ItematendimentoRepository instance;
    private Set<Itematendimento> itematendimentos = new HashSet<Itematendimento>();

    private ItematendimentoRepository() {

    }
    public static ItematendimentoRepository getInstance() {
        if (instance == null) {
            instance = new ItematendimentoRepository();
        }
        return instance;
    }
    public void addItematendimento(Itematendimento itematendimento) {
        itematendimentos.add(itematendimento);
    }
    public Set<Itematendimento> getItematendimentos() {
        return itematendimentos;
    }
    public void removeItematendimento(Itematendimento itematendimento) {
        itematendimentos.remove(itematendimento);
    }
}
