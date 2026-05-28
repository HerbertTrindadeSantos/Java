package Projeto_POO.projeto_02.model.enums;

public enum ProductOrigin {
    PRODUTO_IMPORTADO(1),
    PRODUTO_NACIONAL(2);

    private final int code;

    ProductOrigin(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ProductOrigin fromCode(int code){
        for (ProductOrigin po : values()){
            if (po.code == code){
                return po;
            }
        }
        throw new IllegalArgumentException("Origen de produto nao identificada: "+code);
    }


}
