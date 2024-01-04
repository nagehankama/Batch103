package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        verilen yilin 'Leap year' olup olmadigini kontrol edin kodu yaziniz
        i) yil 100 e bolunurse 400 e de bolunmelidir.
        ii) yill= 100 e bolunmezse 4 e bolunmelidir.
         */
        int year = 1600;
        String leap= year%100==0 ? (year%400==0 ? "Leap year": "Leap year degil"):(year%4==0 ? "Leap year": "Leap year degil");
        System.out.println(leap);
        /*
        asagidaki kurallara gore passwordun gecerli olup olmadigini kontrol eden kodu yaziniz
        i. 8 karakterden fazla veya 8 karakter varsa ilk harfi i olmali
        ii. 8 karakterden az karakter varsa ilk harfi K olmali
         */
        String pwd = "i2a3ed54";
        char ilkHarf= pwd.charAt(0);
        String gecerli = pwd.length()<8 ? (ilkHarf=='K' ? "GECERLI":"GECERSIZ"):(ilkHarf=='i'?"GECERLI":"GECERSIZ");
        System.out.println(gecerli);
    }
}
