package com.curso.nelioalves.secao09.entidade;

public class Conta {

    private int numeroConta;
    private String nomeTitular;
    private double valorInicial = 0.00;

    public Conta() {
    }

    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void depositar(double valor){
        this.valorInicial += valor;
    }

    public void sacar (double valor){
        this.valorInicial -= valor + 5.00;
    }

    @Override
    public String toString() {
        return "Conta{" +
                " numeroConta = " + numeroConta +
                ", nomeTitular = " + nomeTitular +
                ", valorInicial = " + valorInicial;
                }
}

