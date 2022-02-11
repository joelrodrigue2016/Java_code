package com.company;

import java.net.SocketOption;
import java.util.Scanner; // import the Scanner class
import java.util.*;


class Velocity

{
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter distance in meters:- ");
            float distance = sc.nextInt();
            System.out.print("Enter time in seconds:- ");
            float time = sc.nextInt();


            float velocity = distance / time;
            System.out.println("Total= " + velocity + " m/s.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


