package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        // example 1 bir stringteki space haric kac tane karakter kullanildigini yazan kodu yaziniz
        // "Ali okula gitti."
        String str= "Ali okula gitti.";
        int num= str.replace(" ","").length();

        // replace methodu bir stringteki herhangi bir karakteri degirtirmek icin kullanilir.
        System.out.println(num);
        // example 2 bir stringteki tum a harflerini A ya ceviriniz
        String s= "Ankaranin yasina gozlerimin yasina bak";
        String yeniS=s.replace("a","A");
        System.out.println(yeniS);

        // EXAMPLE 3 bir stringteki tum kara kelimelerinin yerine * koyunuz
        String t = "Kara kara dusunme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);

        // example 4 bir stringteki tum sayilari * ceviriniz
        String stdId = "AC202117004";
        String yeniStdId=stdId.replaceAll("[0-9]","*");
        System.out.println(yeniStdId);

        /*
        bir grup data yi ifade eden kod lara regex denir
        regex regular expressions kisaltmasidir
        1 )tum rakamlar[0-9]
        2) tum kucuk harfler [a-z]
        3)tum buyuk harfler [A-Z]
        4) TUM HARFLER [a-zA-Z]
        5) SESLI HARFLER [AEIOUaeiou]
        6) space [ ]
        7) tum rakamlar ve tum harfler [a-zA-Z0-9]
        8 tum noktalama isaretleri \\p{Punct}

        1) rakamlar haric tum karakterler [^0-9]

        ^ ==> haric demek
         */
        //example 5 verilen bir stringte kullanilan noktalama isaretleri ve rakamlar ve space karakterleri haric
        // tum karakterlerin sayisini bulunuz

        String u = "Ali 13 yasinda, dersem inanma!...";
        int sonuc=u.
                replaceAll("[0-9]","").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();
        System.out.println(sonuc);

    }
}
