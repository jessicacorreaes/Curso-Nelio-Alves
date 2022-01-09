package com.curso.nelioalves.secao06;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N = N + N;
        int div;

        System.out.println(N);
        for( int i = 0; i < N; i++){
            int N1 = sc.nextInt();
            int N2 = sc.nextInt();
            div = N1 / N2;
            System.out.println(" Resultado: " + div);
            if(N2 == 0){
                System.out.println("divisao impossivel");
            }
        }

    }
}
