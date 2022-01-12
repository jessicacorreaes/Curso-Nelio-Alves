package com.curso.nelioalves.secao10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Quartos[] quartos = new Quartos[10];

        System.out.println("Quantos estudantes vão alugar quartos?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Aluguel # " + i + ":");
            System.out.println("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("email: ");
            String email = sc.nextLine();
            System.out.println("Quarto: ");
            int quarto = sc.nextInt();
            quartos[quarto] = new Quartos(nome, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++){
            if(quartos[i] != null){
                System.out.println(i + ": " + quartos[i]);
            }
        }

    }
}
