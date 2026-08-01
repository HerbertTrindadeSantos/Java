package Generics.exe_06;

import Generics.exe_06.entitites.Course;
import Generics.exe_06.entitites.Instructor;
import Generics.exe_06.entitites.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do instrutor: ");
        String nameInstructor = sc.nextLine();

        Instructor instructor = new Instructor(nameInstructor);

        System.out.print("Digite a quantidade de cursos? ");
        int qtdCouses = sc.nextInt();

        for (int i = 0; i < qtdCouses; i++) {

            sc.nextLine();
            System.out.print("Digite o nome do curso: ");
            String nameCourse = sc.nextLine();

            Course course = new Course(nameCourse);

            System.out.print("Quantos estudantes no curso "+ nameCourse + ":");
            int qtdStudents = sc.nextInt();

            for (int j = 1; j <= qtdStudents; j++) {
                System.out.print("Digite o codigo do aluno #"+j+": ");
                int codStudent = sc.nextInt();
                instructor.addStudent(new Student(codStudent,course));
            }
            System.out.println();
        }


        System.out.println("Total de estudantes: " + instructor.getStudents().size());



        sc.close();

    }
}
