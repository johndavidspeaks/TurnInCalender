package com.PreWorkTurnins;

import java.util.Calendar;
import java.util.Scanner;

class CalenderDateDiff {

    public static void main(String[] args) {

        // get users first date
        System.out.println("Let's find between two dates! ");
        Scanner input = new Scanner(System.in);
        System.out.println("What's the first year?");
        int year1 = input.nextInt();
        System.out.println("whats first month?");
        int mnt1 = input.nextInt();
        System.out.println("and what is first day in numeric value 1-31?");
        int day1 = input.nextInt();

        // get users 2nd date
        System.out.println(" Ok now the 2nd date ");
        System.out.println("What's the 2nd year?");
        int year2 = input.nextInt();
        System.out.println("whats 2nd month?");
        int mnt2 = input.nextInt();
        System.out.println("and what is 2nd day in numeric value 1-31?");
        int day2 = input.nextInt();


        // make cal
        Calendar calOne = Calendar.getInstance();
        Calendar calTwo = Calendar.getInstance();

        //set user input dates to compare
        calOne.set(year1, mnt1, day1);
        calTwo.set(year2, mnt2, day2);

        // found getTimeInMillis() method and figured i could use it here

        long milliCalcDate1 = calOne.getTimeInMillis();
        long milliCalcDate2 = calTwo.getTimeInMillis();

        // now get the dif in milliseconds
        long difInMilSec = milliCalcDate2 - milliCalcDate1;

        // now to figure the dif in time i found a chart on google to do so

        long diffSec = difInMilSec / 1000;
        long diffMin = difInMilSec / (60 * 1000);
        long difHour = difInMilSec / (60 * 60 * 1000);
        long diffDay = difInMilSec / (24 * 60 * 60 * 1000);

        // out put the answer
        System.out.println("The difference in time is ");
        System.out.println(" Days = " + diffDay);
        System.out.println(" Hours " + difHour);
        System.out.println(" Minutes " + diffMin);
        System.out.println(" Seconds " + diffSec);

        return;


    }
}
