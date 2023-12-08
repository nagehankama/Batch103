package day02methodcreation;

import java.sql.SQLOutput;

public class Car {

   public String marka = "Honda";
   public int fiyat =20000;
   public static void main(String[] args) {
   // object nasil olusturulur.
   //1- class ismini yaz    2) obleye bir isimi veriniz  3) =  4)new keyword unu kullan  5) Class ismini parantesle beraber (Constructor)
            Car                     myHonda             =           new                         Car();
       System.out.println(myHonda.fiyat);//20000
       System.out.println(myHonda.marka);
       myHonda.hareketEt();
       myHonda.dur();
      // MethodCreation class in da object olusturduk.
       MethodCreation obj= new MethodCreation();
    }
   public void hareketEt(){
     System.out.println("Honda guzel hareket eder..");
   }

   public void dur(){
       System.out.println("Honda guvenli durur...");
   }


}
