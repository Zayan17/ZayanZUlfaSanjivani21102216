package com.ZAYAN.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguided_1 {
    public static void main(String[] args) {
        Scanner Zayan = new Scanner(System.in);
        int bilangan;

        System.out.println("|| Program Menampilkan Bilangan Genap ||");

        System.out.print("Masukkan Batas Bilangan : ");
        bilangan = Zayan.nextInt();

        for (int i=1; i<=bilangan; i++) {
            if (i % 2 == 0) {
                System.out.println("Bilangan Genap : " + i);
            }
        }
    }
}