package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a = "Java kolaydir";
        // startsWith("va", 2) kodu ilk 2 karakterden sonra va ile asliyorsa true baslamiyirsa false return eder
        boolean b = a.startsWith("va", 2);
        System.out.println(b);
        //replaceFirst("a","*") bu kod ilk verilen a yi * ya cevirir
        String c = a.replaceFirst("a", "*");
        System.out.println(c);
        // concat methodu iki stringi bir birine yapistirmaya yarar
        // "concatenation" islemi iki turlu yapilabilir 1- + ile 2- concat() ile
        //java bir islem icin bir method uretmisse o methodu kullanmak best practice dir.
        String d = a.concat(" anladinmi");
        System.out.println(d);
        // trim methodu bastaki ve sondaki space karakterlerini siler aradakine dokunmaz
        String e = "   Tom Hanks   ";
        String f = e.trim();
        System.out.println(f);

        String h = "java";
        String i = "java";
        // h.compareTo(i) kod iki tane stringi alfabetik olarak karsilastirir
        // buyuk harf kucuk harf duyarlidir.
        // buyuk harf kucuk harf duyarli olmasini istemezseni compareToIgnoreCase()kullanabilirsiniz
        // h.compareTo(i) kodda "h" nin alfabetik sirasindan "i"ninki cikarilir.
        int k = h.compareTo(i);
        System.out.println(k);
        // a.repeat(3) kodu a stringini yan yana 3 kere yazar.
        String n= a.repeat(3);
        System.out.println(n);
    }
}
