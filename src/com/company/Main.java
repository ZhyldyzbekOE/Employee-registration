package com.company;
import java.util.Scanner;

import com.company.Models.CEO;
import com.company.Models.Developer;
import com.company.Models.Manager;
import com.company.Models.Specialist;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Specialist[] spec = new Specialist[3];
        Developer[] dev = new Developer[4];
        Manager[] man = new Manager[2];

        System.out.println("Creation of specialists: ");
        for(int i = 0; i < spec.length; i++)
        {
            System.out.print("Enter name - ");
            String name = scan.next();

            System.out.print("Enter age - ");
            int age = scan.nextInt();

            System.out.print("Enter salary - ");
            double salary = scan.nextDouble();

            System.out.print("Enter level specialists - ");
            int level = scan.nextInt();
            Specialist specialist = new Specialist(name, age, salary, level);
            spec[i] = specialist;

            specialist.print();
            specialist.workWithClients();
        }
        System.out.println("Creation of developers: ");
        for (int i = 0; i < dev.length; i++)
        {
            System.out.print("Enter name - ");
            String nameDev = scan.next();

            System.out.print("Enter age - ");
            int ageDev = scan.nextInt();

            System.out.print("Enter salary - ");
            double salaryDev = scan.nextDouble();

            System.out.print("Enter grade developer - ");
            String gradeDev = scan.next();

            Developer developer = new Developer(nameDev, ageDev, salaryDev, gradeDev);
            dev[i] = developer;

            developer.print();
            developer.writeCode();
        }
        System.out.println("Creation of managers: ");
        for (int i = 0; i < man.length; i++)
        {
            System.out.print("Enter name - ");
            String nameMan = scan.next();

            System.out.print("Enter age - ");
            int ageMan = scan.nextInt();

            System.out.print("Enter salary - ");
            double salaryMan = scan.nextDouble();

            Manager manager = new Manager(nameMan, ageMan, salaryMan, true);
            man[i] = manager;

            manager.print();
            manager.writeProcedures();
        }

        CEO ceo = new CEO("Жылдызбек", 18, 85000, true, true);
        ceo.print();
        ceo.goPublic();
    }
}
