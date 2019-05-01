package com.silent;

import java.util.Scanner;

public class OpUnary {
    public static void unary() {


        Scanner scn = new Scanner(System.in);
        System.out.print("\nMasukan nilai awal : ");

        int value = scn.nextInt();
        int value1 = value;
        int value2 = value;
        int value3 = value;
        int value4 = value;

        System.out.println("\nOperasi Unary Plus");

        int hasilunplus = +value;
        System.out.println("Nilai Unary Plus dari"+ value1 + "Adalah : " + hasilunplus + "\n");

        System.out.println("Operasi Unary Plus");
        int hasilunminus = -value;
        System.out.println("Nilai Unary Plus dari"+ value2 + "Adalah : " + hasilunminus + "\n");

        System.out.println("Operasi peningkatan nilai sebesar 1 point");
        int hasiladdone = value++;
        System.out.println("Nilai Unary peningkatan one point "+ value3 + "Adalah : " + hasiladdone + "\n");

        System.out.println("Operasi peningkatan nilai sebesar 1 point");
        int hasilminone = value++;
        System.out.println("Nilai Unary peningkatan one point "+ value4 + "Adalah : " + hasilminone + "\n");



    }
}
