package introducao.Projeto_POO.projeto_02.model.enums;

public enum OrderStatus {

    PAGAMENTO_PENDENTE(0),
    PROCESSANDO(1),
    ENVIADO(2),
    ENTREGUE(3);

    private final int processNumber;


    OrderStatus(int processNumber) {
        this.processNumber = processNumber;

    }

    public static OrderStatus searchId(int id) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getProcessNumber() == id) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status incorreto.");
    }

    public int getProcessNumber() {
        return processNumber;
    }

}
