package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*
This code is from a youtube course.
*/
public class App {
    public static void main(String[] args) {

        String name = "Joel";
        char grade = 'A';
        byte age1 = 0;
        short age2 = 20;
        long age3=30L;
        float gpa0 = 2.5f;
        double gpa1 = 3.5;

        boolean isTall;
        isTall = true;

        System.out.println("your name is " + name + " and you are " + gpa0);
        System.out.print("World \n");
        System.out.printf("Your name is %s \n", name);
       /*
           %f -> double or float
           %d -> Integer
           %s -> String
           %c -> Character
           %b -> boolean
       */

        System.out.println((int)3.14);
        System.out.println((double)3.14);

        int intFromString = Integer.parseInt("50");
        double doubleFromString = Double.parseDouble("50.99");

        System.out.println(100 + intFromString);
        System.out.println(100 + doubleFromString);

        String greeting = "Hello";
        //        indexes: 01234
        System.out.println(greeting.toLowerCase(Locale.ROOT));
        System.out.println(greeting.toUpperCase(Locale.ROOT));
        System.out.println(greeting.length());
        System.out.println(greeting.indexOf(0));
        System.out.println(greeting.indexOf("z"));
        System.out.println(greeting.substring(2));
        System.out.println(greeting.substring(1,3));


        /* Numbers*/
        System.out.println(2 * 3);
        System.out.println(10 % 3);
        System.out.println(10/3.0);
        System.out.println(10/3);
        System.out.println((1+2)*3);


        /// just like python

        int num = 10;
        num += 100;
        System.out.println(num);

        num++;
        System.out.println(num);

        System.out.println(Math.PI);
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.round(2.7));
        System.out.println(Math.cos(0.5));


        ///getting input

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter username:  ");
        String username = keyboardInput.nextLine();
        System.out.println("Hello, " + username);



        int [] luckyNumbers = {4,8,15,16,23,42,52};
        luckyNumbers[0] = 90;

        System.out.println(luckyNumbers[0]);
        System.out.println(luckyNumbers[1]);
        System.out.println(luckyNumbers[3]);
        System.out.println(luckyNumbers.length);


        int [] [] numberGrid ={{1,2},{3,4}};

        numberGrid[0][1] = 99;

        System.out.println(numberGrid[0][0]);
        System.out.println(numberGrid[0][1]);



        //////////Lists

        ArrayList<String> friends = new ArrayList<>();

        friends.add("Joel ");
        friends.add("Moises");
        friends.add("Sarai");
        friends.add("Surelis");
        friends.add("Yanibel");



        System.out.println(friends);


        friends.remove("Joel");


        System.out.println(friends.toString());
        System.out.println(friends.get(0));
        System.out.println(friends.contains("Joel"));
        System.out.println(friends.size());


        /*Methods*/

        int sum = addNumbers(4,6);



        boolean isStudent = false;
        boolean isSmart = false;

        if (isStudent || isSmart){
            System.out.println("You are a smart Student");
        } else if (isStudent && !isSmart){
            System.out.println("You are not a smart student");
        } else{
            System.out.println("You are not a student and not smart");
        }


        // >,<,>=,<=,!=,==, String.equals()

        if(1>3){
            System.out.println("Number comparison was true");
        } else{
            System.out.println("number comparison is false");
        }

        if('a' >'b'){
            System.out.println("letter comparison is true");
        } else{
            System.out.println("letter comparison is false");


        }


        char myGrade = 'D';
        switch (myGrade){
            case 'A':
                System.out.println("You pass");
            case 'B':
                System.out.println("You pass");
            case 'C':
                System.out.println("You pass");
            case 'D':
                System.out.println("You pass with condition");
            case 'F':
                System.out.println("you fail");

                break;
            default:
                System.out.println("Invalid grade");

        }




        int index = 1;
        while(index <= 500){
            System.out.println(index);
            index++;
        }


        ///do loops

        do{
            System.out.println(index);
            index++;



        }while(index<=5);


        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }



        int luckyNums[] = {4,1,2,3,6,9,8,5,4,7,25,39,84,56,85,45};
        for (int luckyNum: luckyNums){
            System.out.println(luckyNum);
        }


        ///int division = 10/0;

        try {
            int division = 10/0;

        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }


    }
      ////creating a method

    /* in python this would be
    def addNumbers(int num1,int num2):
         return num+num2
    */
    public static int addNumbers(int num1,int num2){

        return num1 + num2;
    }


}
