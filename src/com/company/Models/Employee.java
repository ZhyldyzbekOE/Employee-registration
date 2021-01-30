package com.company.Models;

public abstract class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee(){

    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if(age > 17 || age < 70){
            this.age = age;
        }else {
            System.out.println("The employee does not meet the age limit! ");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 25000){
            this.salary = salary;
        }else {
            System.out.println("The salary of our employees must be above 25,000! ");
        }

    }
}
