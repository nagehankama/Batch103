package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {
        // example 3 ten 6 ya kdr tam sayilarin toplamini bulan kodu yaziniz
        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;
        }
        // System.out.println(sum); loop un disina yazilirsa sadce son degerini ekrana yazdirir.
        // loop un icine yazilirsa her bir loop icin sum in hangi degerleri aldih=gini yazdirir.
        System.out.println(sum);
        // example 6 dan 3 e kadar sayilarin carpimini yazdiriniz
        int mult = 1;
        for (int i = 6; i > 2; i--) {
            mult = mult * i;
        }
        System.out.println(mult);
        // example size verilen  sayinin rakamlari toplamini giriniz
        int num=385;
        int sonuc=0;
        for(int i= num; i>0;i=i/10){
            sonuc=sonuc+i%10;
        }
        System.out.println(sonuc);
        // example size verilen bir stringi ters ceviren kodu yaziniz
        //"kaba"
        String str ="Kaba";
        String ters="";
        for(int i=str.length()-1;i>-1;i--){
            char c=str.charAt(i);
            ters = ters +c;
        }
        System.out.println(ters);
    }
}
