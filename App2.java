package com.company;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

class Book{
    public String title;
    public String author;
    public static String staticAttribute = "My name is Joel Rodriguez";

    public void readbook(){
        System.out.println("reading " + this.title + " by " + this.author  );
    }
}
class Chef{
    public String name;
    public int age;
    public Chef(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void makeChicken(){
        System.out.println("The Chef makes Chicken");
    }
    public void makeSalad(){
        System.out.println("The Chef makes salad");

    }
    /* @Override
    public void makeSpecialDish(){
        System.out.println("The Chef makes chicken parm");
    }
*/
}

abstract class Vehicle{
    public abstract void move();
    public void getDescription(){
        System.out.println("Vehicles are used for transportation");
    }
}

class Bicycle extends Vehicle{
    @Override
    public void move(){
        System.out.println("The Bycicle pedals");
    }
}


class Plane extends Vehicle{
    @Override
    public void move(){
        System.out.println("The plane flies");
    }
}

interface Animal{
    public void speak();
}

class Cat implements Animal{
    @Override
    public void speak(){
        System.out.println("Meow, Meow");
    }

}
class dog implements Animal{
    @Override
    public void speak(){
        System.out.println("Woof Woof");
    }
}
public class App2 {
    public static void main(String[] args){

        Book book1 = new Book();
        book1.title ="Harry Porter";
        book1.title = "JK Rowling";


        book1.readbook();
        System.out.println(book1.title);
        System.out.println(book1.staticAttribute);

        Plane myPlane = new Plane();
        myPlane.move();
        myPlane.getDescription();

        Animal[] animals = {
                new dog(),
                new Cat()
        };


                for(Animal animal:animals) {
                    animal.speak();
                }

    }
}









