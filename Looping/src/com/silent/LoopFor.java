package com.silent;

import java.util.Scanner;

public class LoopFor {

    public static void lfor() {

        Scanner scn = new Scanner(System.in);

        System.out.print("Masukan nilai perulangan : ");
        int usr_input = scn.nextInt();

        for (int x = 0; x <= usr_input; x++) {

            System.out.println("Print data ke " + x );

        }


    }

}
