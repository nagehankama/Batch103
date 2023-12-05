package day01variables;

public class Variables01 {

    //Variable nasil olusturulur?
    //1) access modifier 2) data type 3) variable ismi 4) = 5) deger 6) ;

    // java da ";" ingilizcedeki "." gibidir.
    // ingilizcede "cumle" deriz. java da "statement" deriz.
    // "=" sembolu "assignment(atama) operator " olarak adlandirilir.
    // "assignment(atama) operator " sagdaki degeri alir soldaki degerin variable in icine koyar
    public int age = 13;
    public int height = 183;

    // java da data type lari
/*
primitive data types
1) int: integerin kisaltmasi. integer tam sayi demektir.32 bit kullanir
matematikte tam sayilarin basi ve sonu yoktur. java da tamsayilarin basi ve sonu vardir.
2) byte: tamsayilar icin kullanilir.8 bit kullanir
en kucuk byte -128
en buyuk byte  127
3) short : tamsayilar icin 16 bit kullanir
en kucuk short -32768
en buyuk short 32767
4) long : tamsayilar icin 64 bit kullanir
int in yetmedigi yerde long kullanilir.
5) float : ondalikli sayilar icindir.32bit kullanir
"float" virgulden sonra 7 basamak icerebilir.
"float" degerlerinde sonuna f veya F koymamiz ferekir
6)double : ondalikli sayilar icindir. 64 bit kullanir
"double" virgulden sonra 16 basamak icerebilir.
7) boolean : true veya false degerler icin kullanilir. 1 bit kullanir.
8) char: tek karakter icin kullanilir. 16 bit kullanir.
A, c, 2, ? , _
note: "char" lara deger verirken degeri ' ' arasina koyunuz

note: numeric data types : byte<short<int<long<float<double
numeric olmayan data types : boolen - char

non-pirimitive data types
string : isim adres kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
string degerleri cift tirnak arasina kullanilmalidir.
string non=primitive dir. yani bir string olusturdugunuzda Java bir suru method verir.


primitive ve non pirimitive arasindaki fark nedir?

 */

public byte price = 12;
public short populationsOfVillage = 23000;
public float priceOfShirt = 13.99F;
public double weightOfCell = 0.000012045;
// siz long demenize ragmen java verilen sayiyi int kabul eder.
    // bu yuzden long bir variable a int araliginin disinda bir sayi verirseniz mutlaka sonuna L veya l koyunuz.
    public long populationOfWorld =7000000000L;
// Burada L koymadiginiz halde problem yok cunku "1234" int araligindadir.
    public long x = 1234;
    public boolean isOld = true;
    public boolean isRich = false;
    public char initial = 'S';
    public String name = "Tom Hanks";
// note main method arabanin motoru gibidir.
// main method calismadan hic birsey calismaz.

    public static void main(String[] args) {


    }
}
