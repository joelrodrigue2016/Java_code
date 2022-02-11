
package com.company;
import java.util.Scanner; // import the Scanner class

public class Main {

    public static void main(String[] args) {
        /*Scanner myObj = new Scanner(System.in);*/
        float distance = 9; //meters
        float time = 50; //seconds
        float velocity = distance/time;
        String n = System.lineSeparator();
        System.out.printf("your distance is:  " + distance + " meters." + n);
        System.out.printf("your time is: " + time + " seconds." + n);
        System.out.printf("therefore, your velocity is: " + velocity + " meters/seconds.");
	// write your code here
    }
}
