package com.curso.nelioalves.secao06;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int fim = 4;
        int n = 0;

        while (n != fim) {
            System.out.println("Informe um número: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n == 1){
                alcool++;
            } else if (n == 2){
                gasolina++;
            } else if (n == 3){
                diesel++;
            }else
                System.out.println("Número invalido");
        }
       System.out.println("1.Álcool " + alcool);
        System.out.println("2.Gasolina " + gasolina);
        System.out.println("3.Diesel " + diesel);
        System.out.println("Muito obrigada");
    }
    
}
