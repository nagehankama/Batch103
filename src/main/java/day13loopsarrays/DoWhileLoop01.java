package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        // example kullanicidan bir sayi aliniz sayi 100 den buyukse kazandin kucukse kaybettin yazdiriniz.
        Scanner input= new Scanner(System.in);
        int sayi=0;
        do {
            System.out.println("Bir Sayi Giriniz...");
          sayi=input.nextInt();
            if(sayi<100){
                System.out.println("Kazandiniz");
            }
        }while(sayi<100);
        System.out.println("Kaybettiniz");
        // example kullanicidan ismini aliniz ilk harfin buyuk harf olup olmadigini kontrol eden kodu yaziniz
        do{
            System.out.println("Ismi giriniz");
            char ilkHarf =input.next().charAt(0);
            if(ilkHarf>='A'&& ilkHarf<='Z'){
                System.out.println("Ismi basariyla girdiniz");
            }else{
                System.out.println("ismi yanlis girdiniz");
                break;
            }
        }while(true);

        // infinite loop : sonsuz dongu
        // artirma azaltma kisminda infinite loop sorunsali olusur.
        // artirma azaltma kismini yazmazsaniz infinite loop sorunsali olusur
    }
}
