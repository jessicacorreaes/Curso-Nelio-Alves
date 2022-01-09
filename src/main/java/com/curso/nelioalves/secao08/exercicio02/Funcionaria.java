package com.curso.nelioalves.secao08.exercicio02;

public class Funcionaria {

    public String nome;
    public double salario;
    public double taxa;

    public double SalarioLiquido(){
        return salario - taxa;
    }

    public void AumentarSalario(double porcentagem){
        salario += salario * porcentagem / 100.0;
    }

    public String toString(){
        return nome + ", $ " + String.format("%.2f", SalarioLiquido());
    }
}
