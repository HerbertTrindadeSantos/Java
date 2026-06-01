package Projeto_Set.Projeto_02.application;

import Projeto_Set.Projeto_02.entities.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de cursos:");
        int qtdCourses = sc.nextInt();
        List<Course> courseList = new ArrayList<>();
        for (int j = 0; j < qtdCourses; j++) {
            System.out.print("Nome do curso:");
            char name = sc.next().charAt(0);
            Course c = new Course(name);
            System.out.print("Quantidade de alunos do curso "+name+":");
            int qtdStundents = sc.nextInt();
            for (int i = 0; i < qtdStundents; i++) {
                System.out.print("Digite o aluno #" + (i + 1) + ":");
                int codStudent = sc.nextInt();
            }
        }


        sc.close();
    }
}
