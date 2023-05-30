package com.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.InputMapUIResource;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        try{
            System.out.println("Masukkan Angka: ");
            int angka1 = input.nextInt();

            System.out.println("Masukkan angka pembagi:");
            int angka2 = input.nextInt();

            int hasil = angka1/angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil+ "(dibulatkan)");
        }

        catch(ArithmeticException | InputMismatchException e){
            System.out.println("error : Program tidak bisa di proses!");
        }
        catch (InputMismatchException e){
            System.out.println("Error : Program hanya dapat memproses angka saja :");
        }
        System.out.println("Program Selesai Dekkkk! :v");
    }
}