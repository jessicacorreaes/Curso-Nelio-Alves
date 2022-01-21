package com.curso.nelioalves.secao14.entities;

import java.util.Date;

public class UdedProduct extends Product{

    private Date manufactureDate;

    public UdedProduct() {}

    public UdedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + "(used) $ " + String.format("%.2f", getPrice()) + "Manufacture date: " + manufactureDate;
    }

}
