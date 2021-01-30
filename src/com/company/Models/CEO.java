package com.company.Models;

import com.company.Services.GoPublic;

public class CEO extends Manager implements GoPublic {

    private boolean hasCompanyCar;

    public CEO(){ }

    public CEO(String name, int age, double salary, boolean hasStocks, boolean hasCompanyCar) {
        super(name, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean getHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public void print(){
        System.out.print("Name: " +getName()+" | "+"Age: "+getAge()+" | "+"Salary: "+getSalary()+" | "+"HasCompanyCar: "+getHasCompanyCar());
        System.out.print("\n");
    }

    @Override
    public void goPublic() {
        System.out.println("I run the company! ");
    }
}
