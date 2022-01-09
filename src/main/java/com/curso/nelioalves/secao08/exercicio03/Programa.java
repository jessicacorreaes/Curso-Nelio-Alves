package com.curso.nelioalves.secao08.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        aluno.nome = sc.nextLine();
        aluno.notaA = sc.nextDouble();
        aluno.notaB = sc.nextDouble();
        aluno.notaC = sc.nextDouble();

        System.out.printf("Nota final %.2f%n", aluno.totalDeNota());

        if (aluno.totalDeNota() < 60.0){
            System.out.println("Reprovado");
            System.out.printf("Faltam %.2f Pontos %n", aluno.pontosFantando());
        }
        else {
            System.out.println("Aprovado");
        }
        sc.close();

    }

}
