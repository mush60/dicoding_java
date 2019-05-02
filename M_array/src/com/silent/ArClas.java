package com.silent;

import java.util.Arrays;
import java.util.Scanner;

public class ArClas {

    public static void IOarr() {

        Scanner scn = new Scanner(System.in);

        System.out.print("Masukan panjang array : ");
        int lenarr = scn.nextInt();

        int[] arr = new int[lenarr];

        for (int i=0; i<lenarr; i++) {
            System.out.print("Masukan nilai array ["+ i +"] : " );
            arr[i] = scn.nextInt();
        }


        System.out.print("Your array length is " + lenarr + "\n");
        System.out.print("Your array is [ ");

        int j = 0;
        while (j < lenarr) {
            System.out.print(arr[j]);
            if (j!=lenarr-1) {
                System.out.print(" ,");
            }
            else {
                System.out.print(" ");
            }
            j++;
        }
        System.out.print("]\n");
    }

    public static void MDarray() {

        Scanner scn = new Scanner(System.in);

        System.out.print("Masukan panjang dimensi 1 : ");
        int d1 = scn.nextInt();
        System.out.print("Masukan panjang dimensi 2 : ");
        int d2 = scn.nextInt();

        int[][] arr = new int[d1][d2];

        for (int i = 0; i < d1; i++) {
            for (int j = 0; j< d2; j++) {

                System.out.print("Masukan nilai arrai index ["+i+"]["+j+"]");
                arr[i][j] = scn.nextInt();

            }
        }

        System.out.println(Arrays.deepToString(arr));
    }

}
