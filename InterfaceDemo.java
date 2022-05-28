package com.zoho;

interface Repairing{
    void repair();
}

interface Riding {
    void ride();
   default void display(){
        System.out.println("From riding interface");
    }
}

class Vehicle{
    void ride(){
        System.out.println("from Vehicle class");
    }
}

class Car /*extends  Vehicle*/ implements Riding,Repairing{
    public void ride(){
        System.out.println(" You are riding a car");
    }

    public void repair(){
        System.out.println("Repairing your Car");
    }
    public void display(){
        System.out.println("From Car class");
    }
}

class Bike /*extends Vehicle*/ implements Riding,Repairing{
    public void ride() {
        System.out.println(" You are riding a bike");
    }
    public void repair(){
        System.out.println("Repairing your Bike");
    }
}

class Mechanic{
    void check (Riding r){
        System.out.println("Checking");
        r.ride();
    }

    void repair(Repairing re){
        System.out.println("Repairing");
        re.repair();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Mechanic m = new Mechanic();
        Car c = new Car();
        Bike b = new Bike();

        m.check(c);               // Passing car object as argument for check method in mechanic class.
        m.check(b);               // Passing bike object as argument for check method in mechanic class.

        System.out.println();
        Riding r = new Car();
        r.ride();                  // Assigning car object to riding interface.
        Riding r1 = new Bike();
        r1.ride();                  // Assigning bike object to riding interface.

        Repairing re = new Car();
        re.repair();              // calling repair method in car.Because Car Implements Repairing interface.

        m.repair(c);              // Passing car object as argument for repair in method mechanic class.
        m.repair(b);              // Passing bike object as argument for repair in method mechanic class.

        c.display();              // calling display method using car object and overriding default method in riding interface.





    }
}
