package com.company.Models;

import com.company.Services.WorkWithClients;

public class Specialist extends Employee implements WorkWithClients {

    private int levels;

    public Specialist(){ }

    public Specialist(String name, int age, double salary, int levels) {
        super(name, age, salary);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if (levels <= 4){
            this.levels = levels;
        }else{
            System.out.println("The specialist level can only be from 1-4");
        }
    }

    @Override
    public void workWithClients(){

        System.out.println("comment: Every specialist must work hard!");
    }

    public void print(){
        System.out.print("Name: " +getName()+" | "+"Age: "+getAge()+" | "+"Salary: "+getSalary()+" | "+"Levels: "+getLevels()+". ");
    }
}
