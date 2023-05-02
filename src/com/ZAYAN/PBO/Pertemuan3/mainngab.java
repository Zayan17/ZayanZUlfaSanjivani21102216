package com.ZAYAN.PBO.Pertemuan3;

public class mainngab {
    public static void main(String[] args){
        System.out.println("NAMA : ZAYAN ZULFA SANJIVANI");
        System.out.println("NIM  : 21102216");
        System.out.println();

        Manajer manajer = new Manajer();
        Pegawai pegawai = new Pegawai();

        manajer.nip = 181910024;
        manajer.nama = "Basuki";

        pegawai.nip = 191220032;
        pegawai.nama = "Ahmad";

        manajer.showinfo();
        manajer.extraInfo();
        manajer.bonus(10000000);
        manajer.bonus();

        pegawai.showinfo();
        pegawai.extraInfo();
    }
}