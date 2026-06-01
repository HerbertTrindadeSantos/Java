package Projeto_Set.Projeto_02.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private char name;
    private Set<Student> students = new HashSet<>();

    public Course(char name) {
        this.name = name;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public void addStudents(Student student){
        students.add(student);
    }

    public Set<Student> getStudents() {
        return students;
    }
}
