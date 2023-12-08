package day02methodcreation;

public class MethodCreation {
// main method icinde kullanacaginiz hersey static olmalidir.
    public static void main(String[] args) {
       System.out.println(toplamaYap(1.2,5));
       System.out.println(ucSayiyiCarp(2, 1.5, 6));
       System.out.println(ilkIkiyiToplaUcuncuIleCarp(2,8,3.2));

    }
    // sout yazip enter a basiniz  System.out.println otomatik olarak gelir.
    // ekrana birsey yazdirmak icin iki tane kod var. i) System.out.println() == satir basi olusturur ii) System.out.print() satir basi olusturmaz

    //example 1: Toplama islemi yapan bir method olusturunuz.
    public static double toplamaYap(double a, double b){
return a+b;
    }
    //example 2: 3 sayiyi birbiri ile carpan bir method olusturunuz.
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;}
    //example 3: ucsayidan ilk ikisni toplayip ucuncu ile carpan method olusturup sonucu ekrana yazdiriniz
    public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c){
        return (a+b)*c;
    }

}
