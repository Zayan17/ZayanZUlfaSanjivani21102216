package com.ZAYAN.PBO.Pertemuan3;

public class Manajer extends Pegawai{
    public void bonus(int bonus){
        System.out.println("Pegawai dengan nama "+nama+
                "(" +nip+ ") mendapatkan bonus sebesar Rp "+bonus);
    }
    public void extraInfo() {
        System.out.println("Jabatan Pegawai : Manajer");
    }

    public void bonus(){
        System.out.println("Error : Harap masukkan jumlah bonusnya!");
    }
}