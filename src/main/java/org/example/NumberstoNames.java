package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.Scanner;

public class NumberstoNames {
    public String pullMonth(int month) {

        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "invalid";
        }
    }


    public static void main(String [] args){
        int month;
        String returns;

        Scanner input = new Scanner(System.in);
        NumberstoNames num = new NumberstoNames();
        System.out.print( "Please enter the number of the month: " );
        month = input.nextInt();
        returns = num.pullMonth(month);


        System.out.println("The name of the month is "+returns+".");




        }
    }

