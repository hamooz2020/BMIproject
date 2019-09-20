package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //declare
        Scanner keyboard;

        double heightFeet,heightInches,weight,totalHeight,kg,meters,notBMI;



        //initialize
       keyboard = new Scanner(System.in);

        double FEETINCHES = 12;

        System.out.println("");


        System.out.println("What is your height \n(feet only (x'11))");
        heightFeet = keyboard.nextDouble();

        System.out.println("What is your height \n(inches only (6'x))");
        heightInches = keyboard.nextDouble();

        System.out.println("What is your weight in pounds?");
        weight = keyboard.nextDouble();

        totalHeight = heightFeet*12+heightInches;

        System.out.println("Your height in Inches is...");
      System.out.println(heightFeet*FEETINCHES+heightInches);

      System.out.println("And in cm it is...");
        System.out.println(totalHeight*0.0254);

        System.out.println("Your weight in kilograms is...");
       System.out.println(weight*0.453592);

       kg = weight*0.45359;
        meters = totalHeight*0.0254;

        notBMI = meters*meters;

       System.out.println("YOUR BMI IS...");
       System.out.println(kg/notBMI);














    }
}
