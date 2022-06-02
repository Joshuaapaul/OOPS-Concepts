package com.zoho;

import java.util.ArrayList;

class Employees{
    private String name;
    private double salary;

    Employees(String name,double salary){
    this.name=name;
    this.salary=salary;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}

    public void raiseSalary(double perecent){
        salary += salary *perecent/100;
    }

    public void  displayDetails(){
        System.out.println(getName()+" "+getSalary());
    }
}

class Manager extends Employees{
    double bonus;
    Manager(String name, double salary,double bonus) {
        super(name, salary);
        this.bonus = bonus;
        }
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getSalary(){            // Method overriding.
        return super.getSalary()+bonus;
    }

    public void displayDetails(){
        System.out.println(getName()+" "+getSalary());
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Employees e1 = new Employees("ken",35000);
        e1.raiseSalary(10);
        System.out.println(e1.getSalary());

        Manager m1 = new Manager("olive",45000,0);
        System.out.println(m1.getSalary());                            // getSalary Method in manager class is called here.

        m1.setBonus(20000);
        System.out.println(m1.getSalary());

        Manager m2 = new Manager("grey",35000,10000); // Overriding the display method.
        m2.displayDetails();

        e1.displayDetails();                                           // method from employee class.


        Employees e2 = new Manager("Black",20000,10000);  // Assigning manager object to employees class.
        e2.displayDetails();

        ArrayList <Employees>details = new ArrayList();
        details.add(e1);
        details.add(e2);
        details.add(m1);
        details.add(m2);

        System.out.println();
        System.out.println();

        for(Employees e : details){
            System.out.println(e.getName()+" "+e.getSalary());
        }
    }
}
