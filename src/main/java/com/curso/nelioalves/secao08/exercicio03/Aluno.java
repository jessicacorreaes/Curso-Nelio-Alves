package com.curso.nelioalves.secao08.exercicio03;

public class Aluno {

    public String nome;
    public double notaA;
    public double notaB;
    public double notaC;

    public double totalDeNota() {
        return notaA + notaB + notaC;
    }

    public double pontosFantando() {
        if (totalDeNota() < 60.00) {
            return 60.0 - totalDeNota();
        }else {
            return 0.0;
        }
    }
}