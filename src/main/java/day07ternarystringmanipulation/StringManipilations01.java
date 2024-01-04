package day07ternarystringmanipulation;

public class StringManipilations01 {
    public static void main(String[] args) {
        /*
        String class methodlari
        1) equals(): i) iki tane String in ayni olup olmadigini anlamaya yarar.
                     ii) equals() method u boolean return eder
        2) equalsIgnoreCase() : i) iki tane string in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar
                                ii) boolean return eder.
        3) toLowerCase(): i)bir stringde ki tum harfleri kucuk harfe cevirmek icin kullanilir.
                            ii) string return eder
        4) toUpperCase(): i)bir stringde ki tum harfleri buyuk harfe cevirmek icin kullanilir.
                            ii) string return eder
        5) charAt(): i) bir stringteki belli bir indexteki karakteri almak icin kullanilir
                    ii) char return eder
        6)lenght() bir stringte kac karakter oldugunu verir ve int return eder
        7) cointains() bir stringte karakterin olup olmadigini anlamak icin kullanilir. boolean return eder
        8 split() bir stringi istedgimiz yerden bolmemeize yardimci olur Array return eder

         */
        /*
        bir paswordun gecerli olup olmadigini asagidaki kurallara gorkontrol eden kodu yaziniz
        i)en az 8 karakter icermeli
        ii) space karakteri icermemeli
        iii) ilk harfi Mveya m olmali
        son karakteri ? olmali

         */
        String pwd= "Manisa12?";
        boolean first = pwd.length()>7;
        boolean second = !pwd.contains(" ");
        boolean third= pwd.charAt(0)=='M' || pwd.charAt(0)=='m';
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';
        System.out.println(first&&second&&third&&fourth);

    }
}
