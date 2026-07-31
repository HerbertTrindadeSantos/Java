package Generics.exe_06.entitites;


import java.util.HashSet;
import java.util.Set;


public class Instructor {

    private String name;

    private Set<Student> students = new HashSet<>();

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public Set<Student> getStudents() {
        return students;
    }
}
