package com.company.Models;

import com.company.Services.WriteCode;

public class Developer extends Employee implements WriteCode {

    private String grades;

    public Developer() { }

    public Developer(String name, int age, double salary, String grades) {
        super(name, age, salary);
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void print(){
        System.out.print("Name: " +getName()+" | "+"Age: "+getAge()+" | "+"Salary: "+getSalary()+" | "+"Grades: "+getGrades());
        System.out.print("\n");
    }

    @Override
    public void writeCode() {
        System.out.println("I am writing my awesome algorithm!");;
    }
}
