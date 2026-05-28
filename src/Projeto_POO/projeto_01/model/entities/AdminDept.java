package Projeto_POO.projeto_01.model.entities;

import Projeto_POO.projeto_01.model.enums.TypeDepartment;
import Projeto_POO.projeto_01.model.enums.WorkerLevel;

public class AdminDept extends Department {

    private Integer qtdProjects;

    public AdminDept(WorkerLevel level, TypeDepartment tp, Integer qtdProjects) {
        super(level,tp);
        this.qtdProjects = qtdProjects;
    }

    @Override
    public double getBonusRate() {
        return 500.00;
    }

    @Override
    public int getProductionCount() {
        return qtdProjects;
    }

    @Override
    public double getValueWork() {
        return 150.00;
    }

    @Override
    public Double getTaxRate() {
        return 0.10;
    }
}

