package com.company.Models;

import com.company.Services.WriteProcedures;

public class Manager extends Employee implements WriteProcedures {

    private boolean hasStocks;

    public Manager() {

    }

    public Manager(String name, int age, double salary, boolean hasStocks) {
        super(name, age, salary);
        this.hasStocks = hasStocks;
    }


    public boolean getHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public void print(){

        System.out.print("Name: " +getName()+" | "+"Age: "+getAge()+" | "+"Salary: "+getSalary()+" | "+"Stocks: "+getHasStocks());
        System.out.print("\n");

    }

    @Override
    public void writeProcedures() {
        System.out.println("I am writing a procedure! ");
    }
}
