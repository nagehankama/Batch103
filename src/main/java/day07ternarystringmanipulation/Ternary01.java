package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
        // example bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz

      //1.yol
      int a=12;
      if(a>0){
          System.out.println("pozitif");
      }else{
          System.out.println("pozitif degil");
      }
      //2.yol ternary
                     // condition  ?  condition dogru ise uyg. kod :condition yanlis ise uyg. kod ;
        String sonuc= a>0         ?   "pozitif"                    : "pozitif degil"                ;
        System.out.println(sonuc);
        //example 2 ikki sayidan kucuk olani secen kodu yazdiriniz

        int b=12;
        int c=23;
        int min= b<c ? b:c;
        System.out.println(min);

        // example 3 verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        int d = -45;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);
        //example 4 iki tane sayi ayni isaretli ise bu sayilari carp farkli isaretli ise "islem yapamam" mesaji veriniz
        int e=12;
        int f=10;
        Object result = (e>0 && f>0) || (e<0 && f<0) ? e*f : "islem yapamam";
        System.out.println(result);
        // ternary farkli data tiplerinde sonuc return ederse sonucun data tipini Oblect yapiniz.
      // note: java da her class in en az bir tane parent class i vardir.
      // sadece object classin parent classi yoktur.
    }
}
