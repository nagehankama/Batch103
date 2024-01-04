package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //note: Switch de sadece int byte short char string data tipleri kullanilabilir.
        //note eger 3 ten fazla durum varsa if kullanilir.

        // kullanicidan islem ve iki sayi alarak islemin sonucu ekrana yazdiran basitbir hesap makinasi yapiniz.
        Scanner input = new Scanner(System.in);
        System.out.println("islemi giriniz: +.-./.*.%");
        char islem = input.next().charAt(0);
        System.out.println("ilk sayiyi giriniz");
        double ilk =input.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double ikinci =input.nextDouble();
        switch (islem){
            case '+':
                System.out.println(ilk+ikinci);
                break;
            case '-':
                System.out.println(ilk-ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '%':
                System.out.println((ilk*ikinci)/100);
                break;
            default:
                System.out.println("bu islem tanimlanmamistir");
        }
    }
}
