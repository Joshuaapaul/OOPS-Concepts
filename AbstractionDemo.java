package com.zoho;

import java.util.ArrayList;

abstract class User{
    abstract void welcome();
    }

class Teacher extends User{
    void welcome(){
        System.out.println("Hello Teacher");
    }
}

class Student extends User {
    void welcome(){
        //super.welcome();
        System.out.println("Hello Student");
    }

}

public class AbstractionDemo {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.welcome();

        Student s1 = new Student();
        s1.welcome();

        User u1 = new Teacher();
        User u2 = new Student();
        u1.welcome();
        u2.welcome();

        ArrayList<User> users = new ArrayList<>();
        users.add(t1);
        users.add(s1);
        users.add(u1);
        users.add(u2);

        System.out.println();
        System.out.println();

        for(User u : users){
            u.welcome();
        }




    }
}
