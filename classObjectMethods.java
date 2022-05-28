package com.zoho;



class Box{
    int height;
    int length;
    int breadth;

    void boxVolume(int height,int length,int breadth){  //NOn-static method
        int vol;
        vol = height*length*breadth;
        System.out.println(vol);
    }

    static void staticVolume(int height, int length, int breadth){  // Static method
        int vol;
        vol = height*length*breadth;
        System.out.println(vol);
    }

    void boxSurfaceArea(int length,int breadth){ // Non-static method.
        int area;
        area = length*breadth;
        System.out.println(area);
    }

    static void add(int length , int breadth,int height){  //overloading
        int add ;
        add = length+breadth+height;
        System.out.println(add);
    }

    static void add(int length , int breadth){ // overloading
        int add ;
        add = length+breadth;
        System.out.println(add);
    }


}

public class classObjectMethods {

    public static void main(String[] args) {

        Box blackBox = new Box();
        blackBox.boxSurfaceArea(2,3);       //calling Non-static method by creating object.
        blackBox.boxVolume(2,3,4);

        Box.staticVolume(1,2,3);     //since it's a static method no need to create object to call method.

        Box.add(1,2,3);              //overloading a method by passing different number of arguments.
        Box.add(1,3);
    }
}
