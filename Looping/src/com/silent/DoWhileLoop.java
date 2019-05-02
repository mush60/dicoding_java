package com.silent;

import java.util.Scanner;

public class DoWhileLoop {

    public static void dwloop() {

        Scanner scn = new Scanner(System.in);

        System.out.print("Masukan Nilai : ");
        int usrin = scn.nextInt();

        do {

            System.out.println("Nilai input : " + usrin );

            usrin--;

        } while (usrin <= 1);


    }

}
