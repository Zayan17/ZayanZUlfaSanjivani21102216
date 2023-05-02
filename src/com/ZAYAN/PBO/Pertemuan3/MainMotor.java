package com.ZAYAN.PBO.Pertemuan3;

public class MainMotor {
    public static void main(String[]args){

        SepedaMotor suzuki = new SepedaMotor("Suzuki","GSX 150R",20000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "YZF R15", 25000000 );
        SepedaMotor honda = new SepedaMotor("Honda", "CBR 150R", 235000000);

        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();

        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 40000000);

//        vespa.showInfo();

        //Sebelum Perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() + " Dengan tipe (before) : " + vespa.getTipe()
        );

        //melakukan proses Perubahan tipe
        vespa.setTipe("Sprint");

        //Lihat hasil perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() + " Dengan tipe (after) : " + vespa.getTipe()
        );


    }
}
