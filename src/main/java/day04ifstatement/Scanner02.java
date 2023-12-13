package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    /*
    note: char variablr lari matematiksel isimlerde kullanirsaniz java ascii degerlerini kullanir.
    ornegin System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
    note: java da "+" sembolunun iki anlami vardir. i) Toplama islemi ii) birlestirme islemi (concatenation)
        java "+" sembolu gorunce once toplama yapmaya calisir. yapamazsa birlestirme islemi yapmaya calisir o da olmazsa hata verir.

     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //1.yol
        System.out.println("ilk ismininizi giriniz");
        char ilk= input.next().charAt(0);
        System.out.println("son ismininizi giriniz");
        char son= input.next().charAt(0);
        System.out.println("" + ilk + son );
        // 2.yol
        System.out.println("Tam isminizi giriniz");
        String tamIsim=input.nextLine();
        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);
        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);

    }
}
