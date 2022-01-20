package com.curso.nelioalves.secao14.application;

import com.curso.nelioalves.secao14.entities.Employee;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println(" Enter the number of employer");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("");
        }



    }

}
