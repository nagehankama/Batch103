package day04ifstatement;

public class ifstatement01 {
    public static void main(String[] args) {
        //if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar.
      // example : sayi pozitif ise ekrana pozitif yazdirin
          int s = 12;
      if(s>0){
          System.out.println("Positive");
      }

      // example 2 : verilen karakter buyuk harf ise "Buyuk Harf" yazdiran kod yaziniz
        char ch = 'A';
      if(ch>='A'&& ch<='Z'){
          System.out.println("Buyuk Harf");

          /* && ==> and demektir. sadece boolean ile kullanilir.
            true && true = true
           */
          // example 3: verilen sayi uc basamakli ise ekrana Uc Basamakli yazdir.

          int n= 123;
          n= Math.abs(n);// abs mutlak degerini alir
          if(n>99 && n<1000){
              System.out.println("Uc Basamakli");
          }
          // example 4 verilen sayi cift sayi ise "cift sayi" yazdiriniz.

          int p = 26;
          p = Math.abs(p);

          if(p%2==0){ // %2 moduler aritmetik '==' esittir demektir
              System.out.println("Cift Sayi");
          }
          // example 5 verilen sayi 300 den kucuk veya 1200 den buyuk ise ekrana harika sayi yazdirin
          int r = 250;
          if(r<300 || r>1200){
              System.out.println("Harika Sayi");
          // || or demektir. sadece boolen degerlerde kullanilir. sadece tek true olmasi yeterlidir.
          // false olmasi icin iki adet false olmasi gereklidir.
          }

      }
      }
}
