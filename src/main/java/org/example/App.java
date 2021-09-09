package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 13 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App
{

    public static void main( String[] args )
    {
        // scanner
        Scanner input = new Scanner(System.in);

        // get info
        System.out.print("What is the principal amount? ");
        String strPrin = input.nextLine();
        System.out.print("What is the rate? ");
        String strInt = input.nextLine();
        System.out.print("What is the number of years? ");
        String strYrs = input.nextLine();
        System.out.print("What is the number of times the interest is compounded per year? ");
        String strComp = input.nextLine();

        //convert strings
        double numPrincipal = Double.parseDouble(strPrin);
        double numInt = Double.parseDouble(strInt) / 100;
        double numYrs = Double.parseDouble(strYrs);
        double numComp = Double.parseDouble(strComp);

        //math
        double compInt = numPrincipal * Math.pow(1 + (numInt/numComp),(numYrs * numComp));
        compInt = Math.round(compInt * 100);
        compInt = compInt / 100;

        //print summary
        System.out.print("$" + Math.round(numPrincipal) + " invested at " + (numInt * 100) + "% for " + Math.round(numYrs) + " years compounded " + Math.round(numComp) + " times per year is $" + compInt+ ".");

    }
}
