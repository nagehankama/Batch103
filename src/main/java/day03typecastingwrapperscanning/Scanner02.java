package day03typecastingwrapperscanning;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
       // example 1: sayilari kullanicidan alan ve toplama islemi yapan kodu yazin
       // 2/adim Scanner class indan object olusturalim
        Scanner input = new Scanner(System.in);
        // ilk sayi ve ikinci sayiyi topla
        System.out.println("ilk sayiyi giriniz");
        double sayi1 = input.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2 = input.nextDouble();
        System.out.println(sayi1+sayi2);
    }
}
