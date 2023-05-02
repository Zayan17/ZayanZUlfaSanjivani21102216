package com.ZAYAN.PBO.Pertemuan2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //berfungsiuntukmembuatinputanditerminal

        System.out.print("Masukkan Nama Anda : ");
        String nama = scanner.nextLine();
        //nextline berfungsi untuk membaca tipe data string

        System.out.println("Selamat Berbuka Puasa " + nama);
    }
}