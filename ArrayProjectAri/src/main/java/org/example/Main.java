package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = 0;
        int sum = 0;

        System.out.print("How many day's temperature? ");
        String input = scanner.nextLine();

        try {
            days = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        int[] temperature = new int[days];



        if(!temperature.equals(0)){

            for(int i =0; i < temperature.length; i++){
                System.out.print("Day " + (i+1) + " high temp: ");
                input = scanner.nextLine();
                temperature[i] = Integer.parseInt(input);
                sum+= Integer.parseInt(input);
            }

        }

        double average = sum / days;

        int above = 0;
        for(int i=0; i<temperature.length; i++){
            if(temperature[i] > average ) {
                above++;
            }
        }


        System.out.println("The average temp is " + average);
        System.out.println("The number of days above average was " + above);
    }



}