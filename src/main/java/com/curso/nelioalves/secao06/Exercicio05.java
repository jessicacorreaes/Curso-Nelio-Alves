package com.curso.nelioalves.secao06;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        System.out.println("Quantos numeros deseja? ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int in = 0;
        int out = 0;

        for(int i = 0; i < N; i++){
            int numero = sc.nextInt();
            if (numero >= 10 && numero <= 20){
                in++;
            }else {
                out++;

            }
        }
        System.out.println("in " + in);
        System.out.println("out " + out);
    }
}
