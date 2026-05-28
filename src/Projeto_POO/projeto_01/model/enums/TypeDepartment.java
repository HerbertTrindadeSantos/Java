package Projeto_POO.projeto_01.model.enums;

public enum TypeDepartment {
    ADMINISTRACAO(1),
    VENDAS(2),
    RECEPCAO(3);

    private final int code;

    TypeDepartment(int code){
        this.code = code;
    }

    public static TypeDepartment fromCode(int code){
        for (TypeDepartment typeD : TypeDepartment.values()){
            if (typeD.getCode() == code){
                return typeD;
            }
        }
        throw new IllegalArgumentException("Código nao encontrado");
    }

    public int getCode() {
        return code;
    }
}
