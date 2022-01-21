package com.curso.nelioalves.secao14.entities;

public class OutsourcedEmployee extends Employee{

    private Double addtionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }
    @Override
    public Double payment(){
        return super.payment() + addtionalCharge * 1.1;
    }
}
