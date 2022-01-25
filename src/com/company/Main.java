package com.company;

public class Main {

    public static void main(String[] args) {
        // Nick Davis 1/25/22 Exercise 2
        // 3 arrays for each type of information
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] currentTemperatures = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};
        //For loop for each day checking to make sure both conditions are true
        for (int i = 0; i < days.length; i++) {
            if (currentTemperatures[i] <= 32 && precipitation[i] > 50) {
                System.out.println(days[i]);
            }

        }
        }
    }

