package com.silent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scn = new Scanner(System.in);

        System.out.println("Menu :");
        System.out.println("1. For Looping");
        System.out.println("2. While");
        System.out.println("3. Do While");
        System.out.println("4. Segitiga Bintang");
        System.out.println("5. Segitiga Angka");

        System.out.print("Masukan Pilihan : ");
        int pilihan = scn.nextInt();

        switch (pilihan) {
            case 1 :
                LoopFor.lfor();
            case 2 :
                WhileLoop.wloop();
                break;
            case 3 :
                DoWhileLoop.dwloop();
                break;
            case 4 :
                Triangle.strtiangle();
                break;
            case 5 :
                Triangle.intTriangle();
                break;
        }

    }
}
