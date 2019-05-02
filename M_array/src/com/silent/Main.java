package com.silent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scn = new Scanner(System.in);

        System.out.println("Menu Project Array :");
        System.out.println("1. Input Outnput Array");
        System.out.println("2. Array Multidimensi");

        System.out.print("Masukan menu : ");

        int menu = scn.nextInt();

        switch (menu) {
            case 1 :
                ArClas.IOarr();
                break;
            case 2 :
                ArClas.MDarray();
                break;
        }

    }
}
