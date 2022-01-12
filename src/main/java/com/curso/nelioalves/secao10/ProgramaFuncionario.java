package com.curso.nelioalves.secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaFuncionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionariosList = new ArrayList<>();

        System.out.println("Quantos funcionários serão cadastrados?");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Funcionario # " + i + ":");

            System.out.println("Id: ");
            int id = sc.nextInt();
            while (hasId(funcionariosList, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.println("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Salario: ");
            double salario = sc.nextDouble();
            funcionariosList.add(new Funcionario(id, nome, salario));
        }

        System.out.println();
        System.out.println("Informe o ID do funcionario que receberá aumento:");
        int id = sc.nextInt();
        Funcionario up = funcionariosList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (up == null){
            System.out.println(" esse numero não existe no sistema");

        }else{
            System.out.println("Entre com a porcentagem:");
            double porcentagem = sc.nextDouble();
            up.aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de empregados");
        for (Funcionario x : funcionariosList){
            System.out.println(x);
        }




        sc.close();
    }

    private static boolean hasId(List<Funcionario> funcionariosList, int id) {
        Funcionario emp = funcionariosList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
