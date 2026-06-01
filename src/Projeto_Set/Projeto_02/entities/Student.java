package Projeto_Set.Projeto_02.entities;

import java.util.Objects;

public class Student {
    private int codStudent;

    public Student(int codStudent) {
        this.codStudent = codStudent;
    }

    public int getCodStudent() {
        return codStudent;
    }

    public void setCodStudent(int codStudent) {
        this.codStudent = codStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return codStudent == student.codStudent;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codStudent);
    }
}
