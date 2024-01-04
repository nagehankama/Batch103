package day05ıfstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        // example: 1. kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz...");
        int s = input.nextInt();
        // 1.yol
        if (s % 2 == 0) {
            System.out.println("Cift Sayi");
        }
        if (s % 2 != 0) {
            System.out.println("Tek Sayi");
        }
        // 2.yol
        if (s % 2 == 0) {
            System.out.println("Cift Sayi");
        } else {
            System.out.println("Tek Sayi");
        }
        // example 2: bir sayinin negatif pozitif veya notr oldugunu soyleyen kodu yaziniz

        System.out.println("bir sayi giriniz...");
        double d = input.nextDouble();
        if (d > 0) {
            System.out.println("pozitif");
        } else if (d == 0) {
            System.out.println("notr");
        } else {
            System.out.println("negatif");
        }
    }
}
