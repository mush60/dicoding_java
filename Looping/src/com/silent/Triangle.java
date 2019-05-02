package com.silent;

import java.util.Scanner;

public class Triangle {

    public static void strtiangle() {

        Scanner scn = new Scanner(System.in);

        System.out.print("Masukan tinggi segitiga : ");
        int tnggi = scn.nextInt();

        for (int x=tnggi; x>=1; x--) {
            for (int y = x; y>0; y--) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }

    }

    public static void intTriangle() {

        Scanner scn = new Scanner(System.in);

        System.out.print("Masukan tinggi segitiga : ");
        int tnggi = scn.nextInt();

        for (int x=1; x<=tnggi; x++) {
            for (int y = 0; y<x; y++) {
                System.out.print(y+1 + " ");
            }

            System.out.print("\n");
        }

    }

}
