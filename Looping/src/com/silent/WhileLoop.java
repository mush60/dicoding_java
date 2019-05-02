package com.silent;

import java.util.Scanner;

public class WhileLoop {

    public static void wloop() {

        Scanner scn = new Scanner(System.in);

        System.out.print("Masukan nilai perulangan : ");
        int usr_input = scn.nextInt();

        while (usr_input <= 0) {

            System.out.println("Nilai User Input = " + usr_input );

            usr_input--;

        }

    }

}
