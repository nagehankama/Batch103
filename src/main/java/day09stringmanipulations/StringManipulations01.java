package day09stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str= "Java is easy";
        int idxA = str.indexOf("a");
        System.out.println(idxA);
        // indexOf () methodu verilen karakterlerin ilk gorunumunun index ini verir.
        //lastIndexOf() methodu verilen karakterlerin son gorunumunun index ini verir.
        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);
        String s= "Mississippi";
        int idxI=s.indexOf('i'); // indexOf methodu hem string hem char ile kullanilir.
        System.out.println(idxI);//1

        int idxIss1 =s.indexOf("iss");
        System.out.println(idxIss1);
        int idxIss2 =s.lastIndexOf("iss");
        System.out.println(idxIss2);
        //example 1 bir string deki krakterlerin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaizniz
        String t="Helloooo";
        char c = 'e';
        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("tekrarli");
        }else{
            System.out.println("tekrarsiz");
        }
        //indexof iki parametreile kullanilirsa ikinci parametre kadar harfi gectikten sonra
        // istenilen karakterin ilk gorunumunu gosterir

        String v = "";
        boolean bosMu= v.isEmpty();
        System.out.println(bosMu);
        /*
        isEmpty() methodu bir stringin bos olup olmadigini kontrol eder
        eger hic karakter yoksa true return eder varsa false return eder
         */
    }
}
