package com.curso.nelioalves.secao05;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Informe um numero inteiro: ");
        numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("O numero informado é par");
        }else
            System.out.println("O numero informado é impar");

        sc.close();

    }
}
