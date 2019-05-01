package com.silent;

import java.util.Scanner;

public class IfElse {

    public static void elif() {

        Scanner scr = new Scanner(System.in);

        System.out.println("\nMasukan nilai untuk melihat grade anda : ");

        int nilai = scr.nextInt();


        if (0 < nilai && nilai < 59) {
            System.out.println("Your grade is E");
        }
        else if (59 < nilai && nilai < 70) {
            System.out.println("Your grade is D");
        }
        else if (69 < nilai && nilai < 80) {
            System.out.println("Your grade is C");
        }
        else if (79 < nilai && nilai < 90) {
            System.out.println("Your grade is B");
        }
        else if (89 < nilai && nilai < 101) {
            System.out.println("Your grade is A");
        }
        else {
            System.out.println("Wrong input, input only at range 1 - 100");
        }

    }

}
