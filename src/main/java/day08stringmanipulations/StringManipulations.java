package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        // example kullanicidan aldigimiz isim ismin ilk ve son harfini alan kodu yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = input.next();
        // 1.yol
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length() - 1);
        System.out.println("" + ilkHarf + sonHarf);
        // 2.yol
       String ilk= isim.substring(0,1);
       String son= isim.substring(isim.length() - 1);
        System.out.println(ilk+son);

        // example 2 verilen Stringteki sadece hayvan isimlerini ekrana yazdiriniz,
        // "ben kedi, esim tavuk, oglum sever inek"
        String str= "ben kedi, esim tavuk, oglum sever inek";
        // substring() in iki kullanimi vardir.
        // 1 substring(baslangic indexi, itis indexi) stringin ortasindan bir parca almaya yarar.
        //2 substrung( baslangic indexi) Stringin verilen indexten sonuna kadar olan kismi alir
        String kedi = str.substring(4,8);
        String tavuk =str.substring(15,50);
        String inek =str.substring(34);
        System.out.println(kedi+tavuk+inek);
        // example 3 ilk isim ve soy isimi iceren isimlerden ilk ve soy isimlerin bas harflerini ekrana yazdiriniz.

        System.out.println("ilk ve soy isminizi giriniz");
        String tamIsim = input.nextLine();
        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a+b);
    }
}
