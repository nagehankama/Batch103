package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        /*
        example 3den 10 a kdr tamsayilari yni satirda ekrana yazdiran kodu yaziniz
         */
        //1. yol
        for(int i=3;i<11;i++){
            System.out.print(i+" ");
        }
        //2.yol
        int i=3;
        while (i<11){
            System.out.print(i+" ");
            i++;
        }
        //example 17den 4 e kdr tum cift sayilari ekrana yazdiran kodu yaziniz
        int k=17;
        while(k>5){
            if(k%2==0) {
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();
        // example 12 den 67 ye kr sayilarin toplami veren kodu yaziniz

        int sum =0;
        int m =12;
        while(m<68){
            sum=sum+m;
            m++;
        }
        System.out.println(sum);
        //example size verilen bir tam sayinin rakamlari toplamini ekrana yazdiran kodu yaziniz
        int sonuc= 0;
        int sayi= 385;
        while(sayi>0){
            sonuc=sonuc+sayi%10;
            sayi=sayi/10;
        }
        System.out.println(sonuc);
        System.out.println();
    // example kullanicidan aldginiz bir sayinin carpim tablosunu ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int s= input.nextInt();
        int n =1;
        while(n<11){
            System.out.println(s+"x"+n+"="+s*n);
            n++;
        }

    }
}
