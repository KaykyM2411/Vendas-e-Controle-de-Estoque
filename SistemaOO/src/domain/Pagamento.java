package domain;

public class Pagamento {
    Pedido pedido = new Pedido();
    private static  Pagamento instance;

    private Pagamento() {

    }
    public static Pagamento getInstance() {
        if (instance == null) {
            instance = new Pagamento();
        }
        return instance;
    }
}
