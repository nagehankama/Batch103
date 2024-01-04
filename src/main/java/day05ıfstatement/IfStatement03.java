package day05ıfstatement;

import java.util.Scanner;

public class IfStatement03 {
    /*
    iki tane String in birbirine esit olup olmadigini anlamak icin "==" degil, "equals" kullaniniz.
    iki tane String in birbirine esit olup olmadigini anlamak icin iki tane method kullaniriz.
    i) equals() ==> Buyuk hrf ve kucuk harfi onemser
    ii) equalsIgnoreCase() ==>Buyuk hrf ve kucuk harfi onemsemez.
     */
    public static void main(String[] args) {
        // example: kullanicidan gun isimlerini aliniz o gunu hfta sonu mu hafta icimi oldugunu kullaniciya soyleyiniz
        Scanner input = new Scanner(System.in);
        System.out.println("bir gun giriniz...");
        String gun = input.next();
        //1.yol
        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu..");
        } else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici..");
        } else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("Hafta ici..");
        } else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("Hafta ici..");
        } else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Hafta ici..");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici..");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu..");
        } else {
            System.out.println("Gecerli bir gun giriniz");
        }
        // 2.yol
        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta Sonu");
        }else if (gun.equalsIgnoreCase("Cuma") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici..");
        } else {
            System.out.println("Gecerli bir gun giriniz");
        }
        //3.yol
        boolean haftaSonu=gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");
        boolean haftaIci=gun.equalsIgnoreCase("Cuma") ||
                          gun.equalsIgnoreCase("Persembe") ||
                         gun.equalsIgnoreCase("Carsamba") ||
                         gun.equalsIgnoreCase("Sali") ||
                          gun.equalsIgnoreCase("Pazartesi");

        if (haftaSonu) {
            System.out.println("Hafta Sonu");
        }else if (haftaIci) {
            System.out.println("Hafta ici..");
        } else {
            System.out.println("Gecerli bir gun giriniz");
        }
    }

}

