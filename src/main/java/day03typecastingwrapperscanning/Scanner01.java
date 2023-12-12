package day03typecastingwrapperscanning;

import java.util.Scanner;

public class Scanner01 {
// scanner kullanicidan data almaya yarar.scanner kullanici ile etkilesim saglamamizi saglar.
// scanner bir java class idir. bu class i kullanabilmek icin import etmek gerekir.
// scanner class i java nin util kutuphanesinin icindedir.
    public static void main(String[] args) {
        // kullanicidan data almak icin yapilmasi gerekenler
        //1. adim scanner Class indan object olustur.

        Scanner input = new Scanner(System.in);
        // 2. adim kullaniciya ne yapacagini soyle
        System.out.println("hey kullanici yasini gir...");
        //3/adim kullnicidan aldiginiz data yi bir variable in icine koyun
        byte age = input.nextByte();
        System.out.println("hey kullanici senin yasin" + age);
    }
}
