package com.curso.nelioalves.secao05;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digte um numero: ");
        numero = sc.nextInt();

        if (numero >= 0){
            System.out.println("O número que voce digitou é positivo");
        }else
            System.out.println("O número que voce digitou é negativo");


        sc.close();
    }
}
