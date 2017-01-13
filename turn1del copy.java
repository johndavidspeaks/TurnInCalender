package com.gcbc;

import java.util.Scanner;

class TurnOneDel {

    public static void main(String[] args) {

        // Greeting and intro to program
        System.out.println(" ");
        System.out.println("Let's check to see if a number ");
        System.out.println("can be cubed to add to it's self like ");
        System.out.println("153 = 1^3 = 1 + 5^3 = 125 + 3^3 = 27");
        System.out.println(" 1 + 125 + 27 = 153");
        System.out.println("Now you try it");
        System.out.println(" Enter a  number : ");

                    // User input
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();

        System.out.println(" Your guess is " + userNum + " And the Results are ?");

        int value = userNum;


        // isolate each digit in the user input number
        int num1 = value % 10;
        int num2 = value / 10 % 10;
        int num3 = value / 100 % 10;
        int num4 = value / 1000 % 10;
        int num5 = value / 10000 % 10;
        int num6 = value / 100000 % 10;
        int num7 = value / 1000000 % 10;


        // find single digit ^3 results
        int num1Cubed = num1 * num1 * num1;
        int num2Cubed = num2 * num2 * num2;
        int num3Cubed = num3 * num3 * num3;
        int num4Cubed = num4 * num4 * num4;
        int num5Cubed = num5 * num5 * num5;
        int num6Cubed = num6 * num6 * num6;
        int num7Cubed = num7 * num7 * num7;


        // now add results  from ^3
        int resultCubed = num1Cubed + num2Cubed + num3Cubed + num4Cubed + num5Cubed + num6Cubed + num7Cubed;

        // now test results to find if number cubed and added is the same as user input

        if (userNum == resultCubed) {
            System.out.println("True! your number can be cubed " +
                    "!");
            // show user why
            System.out.println(num3 + " = " + num3 + " * " + num3 + " * " + num3 + " = " + num3Cubed);
            System.out.println(num2 + " = " + num2 + " * " + num2 + " * " + num2 + " = " + num2Cubed);
            System.out.println(num1 + " = " + num1 + " * " + num1 + " * " + num1 + " = " + num1Cubed);
            System.out.println();
            System.out.println("                ___");
            System.out.println(value + " << Same >> " + resultCubed);

        } else {
            System.out.println(" False ! Sorry.  Try again! ");

        }


    }
}
