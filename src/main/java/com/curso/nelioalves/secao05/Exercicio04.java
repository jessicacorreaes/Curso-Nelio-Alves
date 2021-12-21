package com.curso.nelioalves.secao05;
//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner hr = new Scanner(System.in);
        double horaInicial;
        double horaFinal;

        System.out.println("Digite a hora inicial:");
        horaInicial = hr.nextDouble();
        System.out.println("Digite a hora inicial:");
        horaFinal = hr.nextDouble();



        hr.close();

    }
}
