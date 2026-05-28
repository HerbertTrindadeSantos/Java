package Projeto_POO.projeto_01.model.entities;

import Projeto_POO.projeto_01.model.enums.TypeDepartment;
import Projeto_POO.projeto_01.model.enums.WorkerLevel;
import Projeto_POO.projeto_01.model.services.Taxable;


public abstract class Department implements Taxable {

    private WorkerLevel level;
    private TypeDepartment type;

    public Department(WorkerLevel level,TypeDepartment type) {
        this.level = level;
        this.type = type;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public TypeDepartment getType() {
        return type;
    }

    public abstract double getBonusRate();

    public abstract int getProductionCount();

    public abstract double getValueWork();

    public double bonusAmount(){
        return getBonusRate() * getProductionCount();
    }

    @Override
    public Double taxAmount(double salary) {
        return Taxable.super.taxAmount(salary);
    }
}



