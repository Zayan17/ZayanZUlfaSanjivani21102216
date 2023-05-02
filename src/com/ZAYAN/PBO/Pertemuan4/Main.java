package com.ZAYAN.PBO.Pertemuan4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("NAMA : ZAYAN ZULFA SANJIVANI");
        System.out.println("NIM  : 21102216");
        System.out.println();

        Scanner input = new Scanner(System.in);
        WarungMakan wm = new WarungMakan();
        Menu m = new Menu();
        Menu m1 = new Menu();
        Menu m2 = new Menu();
        Menu m3 = new Menu();

        wm.nama_warung = " Warung Mbok Ijah ";
        wm.alamat = " Doksay";
        wm.no_telp = " 085671237854";

        m1.no_makanan = 1;
        m1.nama_makanan = "Nasi Goreng";
        m1.harga = 10000;
        m1.Stok = 10;

        m2.no_makanan = 2;
        m2.nama_makanan = "Nasi Goreng Spesial";
        m2.harga = 15000;
        m2.Stok = 4;

        m3.no_makanan = 3;
        m3.nama_makanan = "Nasi Goreng Spesial + Telur";
        m3.harga = 20000;
        m3.Stok = 20;

        wm.detailwarung();
        m1.detailMakanan();
        m2.detailMakanan();
        m3.detailMakanan();

        System.out.println("Masukkan Nomor Makanan : ");
        m.no_makanan = input.nextInt();
        if (m.no_makanan == 1){
            System.out.println("Masukkan Jumlah Pesanan : ");
            wm.beliMakanan(m1, input.nextInt());
            m1.totalharga();
            wm.cekStok(m1);

        } else if (m.no_makanan == 2){
            System.out.println("Masukkan Jumlah Pesanan : ");
            wm.beliMakanan(m2, input.nextInt());
            m2.totalharga();
            wm.cekStok(m2);

        } else if (m.no_makanan == 3){
            System.out.println("Masukkan Jumlah Pesanan : ");
            wm.beliMakanan(m3, input.nextInt());
            m3.totalharga();
            wm.cekStok(m3);

        }
        input.close();
    }
}