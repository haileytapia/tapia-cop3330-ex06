/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Calendar;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String currentAge, retireAge;
        Scanner input = new Scanner(System.in);

        int currentInt, retireInt;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        currentAge = input.nextLine();
        currentInt = Integer.parseInt(currentAge);

        System.out.print("At what age would you like to retire? ");
        retireAge = input.nextLine();
        retireInt = Integer.parseInt(retireAge);

        System.out.print("You have " + (retireInt - currentInt) + " years left until you can retire.\nIt's " + year + ", so you can retire in " + (year + (retireInt - currentInt)) + ".");
    }
}