package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // membuat objek HP
        AC Micro8 = new Xiaomi();

        // membuat objek user
        ACUser arie = new ACUser(Micro8);

        // kita coba nyalakan HP-nya
        arie.turnOnTheAC();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI AC ===");
            System.out.println("[1] Nyalakan AC");
            System.out.println("[2] Matikan AC");
            System.out.println("[3] Naikan Suhu");
            System.out.println("[4] Turunkan Suhu");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                arie.turnOnTheAC();
            } else if (aksi.equalsIgnoreCase("2")){
                arie.turnOffTheAC();
            } else if (aksi.equalsIgnoreCase("3")){
                arie.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                arie.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}


