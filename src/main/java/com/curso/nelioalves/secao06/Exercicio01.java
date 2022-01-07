package com.curso.nelioalves.secao06;

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int senha = 2002;
        int n = 0;

        while (n != senha){

            System.out.println("Digite a senha: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
    }

}
