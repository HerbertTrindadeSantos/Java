package Projeto_POO.projeto_01.model.entities;

import Projeto_POO.projeto_01.model.enums.TypeDepartment;
import Projeto_POO.projeto_01.model.enums.WorkerLevel;

public class RecepcionDept extends Department {

    private Integer qtdPeopleCount;


    public RecepcionDept(WorkerLevel level, TypeDepartment tp, int qtdPeopleCount) {
        super(level,tp);
        this.qtdPeopleCount = qtdPeopleCount;
    }

    @Override
    public double getBonusRate() {
        return 0.80;
    }

    @Override
    public int getProductionCount() {
        return qtdPeopleCount;
    }

    @Override
    public double getValueWork() {
        return 80.00;
    }

    @Override
    public Double getTaxRate() {
        return 0.10;
    }
}
