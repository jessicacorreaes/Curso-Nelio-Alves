package com.curso.nelioalves.secao08.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Programa {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionaria funcionaria = new Funcionaria();

        System.out.println("Nome: ");
        funcionaria.nome = sc.nextLine();
        System.out.println("Salario: ");
        funcionaria.salario = sc.nextDouble();
        System.out.println("Taxa: ");
        funcionaria.taxa = sc.nextDouble();

        System.out.println("funcionario " + funcionaria);
        System.out.println("Quanto deseja dar de aumento");
        double aumento = sc.nextDouble();
        funcionaria.AumentarSalario(aumento);

        System.out.println("novo salario " + funcionaria);

    sc.close();

    }

}
