package Projeto_HashCodeEquals.teste_01.application;

import Projeto_HashCodeEquals.teste_01.entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Joao Ferreira","joaoferreira@gmail.com");
        Client c2 = new Client("Patrick Souza","patrickSouza@hotmail.com");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
