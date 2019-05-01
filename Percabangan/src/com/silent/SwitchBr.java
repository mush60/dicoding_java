package com.silent;

import java.util.Scanner;
import com.silent.IfElse;

public class SwitchBr {
    public static void switchBr() {

        Scanner src = new Scanner(System.in);

        System.out.println("Program memilih menu menggunakan switch");

        System.out.println("1. Helloworld");
        System.out.println("2. Input Output");
        System.out.println("3. Aritmatika");
        System.out.println("4. if else");

        System.out.print("Masukan menu pilihan anda : ");
        int chc = src.nextInt();

        switch (chc) {

            case 1 :

                System.out.println("Hello world!");
                break;

            case 2 :

                System.out.print("Masukan nama anda : ");
                String name = src.nextLine();
                System.out.println("Hai!.. " + name + "thank you for trying :)");
                break;

            case 3 :

                System.out.print("Masukan nilai 1 : ");
                int val1 = src.nextInt();
                System.out.print("Masukan nilai 2 : ");
                int val2 = src.nextInt();

                int hasiljml = val1+val2;
                int hasilmin = val1-val2;
                int hasilkali = val1*val2;
                float hasilbg = val1/val2;
                int hasilmod = val1%val2;

                System.out.println("Hasli Jumlah = " + hasiljml);
                System.out.println("Hasli Kurang = " + hasilmin);
                System.out.println("Hasli Kali = " + hasilkali);
                System.out.println("Hasli Bagi = " + hasilbg);
                System.out.println("Hasli Modulu = " + hasilmod);

                break;

            case 4 :

                IfElse.elif();
                break;

        }

    }
}
