package Generics.exe_06.entitites;

import java.util.Objects;

public class Student {

    private Integer cod;
    private Course course;

    public Student(Integer cod, Course course) {
        this.cod = cod;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Objects.equals(cod, student.cod);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }
}
