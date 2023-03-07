package com.example.awtSample;

public class Main {

    public static void main(String[] args) {

        Veverica v1 = new Veverica("Chip","braon");
        System.out.println(v1);

        v1.savijLevuRuku();
        System.out.println(v1);

        v1.savijDesnuRuku();
        System.out.println(v1);

        v1.pridrzi("LESNIK");
        System.out.println(v1);

        v1.ispruziLevuRuku();
        System.out.println(v1);

        v1.ispruziDesnuRuku();
        System.out.println(v1);

    }
}
