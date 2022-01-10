package com.curso.nelioalves.secao09.aplicacao;

import com.curso.nelioalves.secao09.entidade.Conta;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite o número da conta:");
        int numero = sc.nextInt();

        sc.nextLine();
        System.out.println("Digite o titular da conta: ");
        String nome = sc.nextLine();

        System.out.println("Existe um depósito inicial (s/n)?");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.println("Insira o valor do depósito inicial:");
            double valor = sc.nextDouble();
            conta = new Conta(numero, nome, valor);
        }else{
            conta = new Conta(numero, nome);
        }

        System.out.println();
        System.out.println("Account data: " + conta.toString());

        System.out.println("Deposite um valor: ");
        double valor = sc.nextDouble();
        conta.depositar(valor);

        System.out.println("Conta atualizada " + conta.toString());

        System.out.println("sacar um valor: ");
        valor = sc.nextDouble();
        conta.sacar(valor);

        System.out.println("Conta atualizada " + conta.toString());

    }
}
