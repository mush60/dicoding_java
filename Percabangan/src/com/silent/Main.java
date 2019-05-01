package com.silent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Menu :");
        System.out.println("1. Percabangan if");
        System.out.println("1. Percabangan switch");

        Scanner scr = new Scanner(System.in);

        System.out.print("\nMasukan pilihan anda : ");

        int pilihan = scr.nextInt();

        if (0 < pilihan && pilihan < 3) {

            if(pilihan == 1) {
                IfElse.elif();
            }

            else {
                SwitchBr.switchBr();
            }

        } else {

            System.out.println("Masukan antara 1 atau 2");

        }


    }
}
