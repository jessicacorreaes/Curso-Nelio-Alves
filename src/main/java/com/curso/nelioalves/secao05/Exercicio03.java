package com.curso.nelioalves.secao05;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int divisao;

        System.out.println("Digite o primeiro numero: ");
        A = sc.nextInt();

        System.out.println("Digite o primeiro numero: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
