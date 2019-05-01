package com.silent;

import java.util.Scanner;

public class InputScanner {

    public static void readInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan input 1 anda : ");
        int masukan1 = scan.nextInt();
        System.out.print("Masukan input 2 anda : ");
        int masukan2 = scan.nextInt();

        System.out.print("\nMasukan anda yaitu : \n");

        System.out.println("Masukan 1 : " + masukan1 + " \nMasukan 2 : " + masukan2);

        int HasilKali = masukan1*masukan2;
        float HasilBagi = masukan1/masukan2;
        int Jml = masukan1 + masukan2;
        int Krng = masukan1 - masukan2;

        System.out.print("\nHasil kali = " + HasilKali + "\nHasil bagi = " +
                HasilBagi + "\nHasil Jumlah = " + Jml + "\nHasil Kurang = " + Krng + "\n" );
    }
}
