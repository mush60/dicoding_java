package com.silent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OprArimatika {
    public static void aritmatik() {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);

        int val1 = 0;
        int val2 = 0;

        try {

            System.out.print("Masukan nilai variabel 1 = ");
            val1 = Integer.parseInt(bfr.readLine());
            System.out.print("Masukan nilai variabel 2 = ");
            val2 = Integer.parseInt(bfr.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

        int hasiljml = val1 + val2;
        int hasilkurang = val1 - val2;
        int hasilkali = val1 * val2;
        float hasilbagi = val1/val2;
        int sisahslbg = val1 % val2;

        System.out.println("Hasil Penjumlahan = " + hasiljml);
        System.out.println("Hasil Pengurangan = " + hasilkurang);
        System.out.println("Hasil Perkalian = " + hasilkali);
        System.out.println("Hasil Pembagian = " + hasilbagi);
        System.out.println("Hasil Modulus = " + sisahslbg);

    }
}
