package Repository;

import Entities.Pagamento;

import java.util.HashSet;
import java.util.Set;

public class PagamentoRepository {
    private static PagamentoRepository instance;
    private Set<Pagamento> pagamentos = new HashSet<Pagamento>();

    private PagamentoRepository() {

    }
    public static PagamentoRepository getInstance() {
        if (instance == null) {
            instance = new PagamentoRepository();
        }
        return instance;
    }
    public Set<Pagamento> getPagamentos() {
        return pagamentos;
    }
    public void addPagamento(Pagamento p) {
        pagamentos.add(p);
    }
}
