package com.curso.nelioalves.secao05;
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        int cod1 = 1;
        int cod2 = 2;
        int cod3 = 3;
        int cod4 = 4;
        int cod5 = 5;
        int item;
        int quantidade;

        double preco1 = 4.00;
        double preco2 = 4.50;
        double preco3 = 5.00;
        double preco4 = 2.00;
        double preco5 = 1.50;
        double total;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero do Item");
        item = sc.nextInt();
        System.out.println("Informe a quantidade");
        quantidade = sc.nextInt();

        if (item == 1) {
            total = quantidade * 4.0;
        }
        else if (item == 2) {
            total = quantidade * 4.5;
        }
        else if (item == 3) {
            total = quantidade * 5.0;
        }
        else if (item == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);



        sc.close();
    }



}
