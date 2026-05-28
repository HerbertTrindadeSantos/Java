package Projeto_POO.projeto_01.model.entities;

import Projeto_POO.projeto_01.model.enums.TypeDepartment;
import Projeto_POO.projeto_01.model.enums.WorkerLevel;

public class SalesDept extends Department {

    private Integer qtdSales;

    public SalesDept(WorkerLevel level, TypeDepartment tp, int qtdSales) {
        super(level,tp);
        this.qtdSales = qtdSales;
    }

    @Override
    public double getBonusRate() {
        return 4.50;
    }

    @Override
    public int getProductionCount() {
        return qtdSales;
    }

    @Override
    public double getValueWork() {
        return 90.00;
    }

    @Override
    public Double getTaxRate() {
        return 0.12;
    }
}

