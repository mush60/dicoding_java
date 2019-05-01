package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Helloworld");

        Gitar.bunyi();

        Mobil.jmlban();

        Motor.jmlban();

        Kereta.jmlban();

        Date today = new Date();

        System.out.println("Hari ini " + today);

        Date tummorow = DateUtils.addDays(today, 1);

        System.out.println("Besok " + tummorow);
    }
}
