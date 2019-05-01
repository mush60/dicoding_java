package com.silent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BReader {

    public static void bfrin() {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader bread = new BufferedReader(isr);

        System.out.print("BufferedReader Input\n");

        int value1 = 0;
        int value2 = 0;

        try {

            System.out.print("Masukan Input 1 : ");
            value1 = Integer.parseInt(bread.readLine());
            System.out.print("Masukan Input 2 : ");
            value2 = Integer.parseInt(bread.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

        int hasil = value1 + value2;

        System.out.println("Hasil Penjummlahan = "+ hasil);

    }
}
