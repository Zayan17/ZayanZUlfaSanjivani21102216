package com.PBO.Pertemuan6;

public class Trycatch{
    public static void main(String[] args) {
        //membuat array
        int[] angka = {1,2,3,4,5};

        try{
        System.out.println(angka[6]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array tidak sampai segitu");
        }
        System.out.println("Proses Selesai!");
    }
}