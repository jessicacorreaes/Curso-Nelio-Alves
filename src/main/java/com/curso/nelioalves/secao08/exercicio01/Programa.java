package com.curso.nelioalves.secao08.exercicio01;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Largula e Altura do triangulo: ");
        Retangulo ret = new Retangulo();

        ret.altura = sc.nextDouble();
        ret.largura = sc.nextDouble();

        System.out.printf("Area = %.2f%n", ret.Area());
        System.out.printf("Perimetro: %.2f%n", ret.Perimetro());
        System.out.printf("Diagonal:  %.2f%n", ret.Diagonal());

    }
}
