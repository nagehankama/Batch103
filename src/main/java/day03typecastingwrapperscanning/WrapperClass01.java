package day03typecastingwrapperscanning;

import java.sql.SQLOutput;

public class WrapperClass01 {

    public static void main(String[] args) {
        /*
        note: Java primitive ata typelara methodlar ekleyerek yeni bir yapi olusturdu,
        bu yapiya "wrapper class"
        primitive           Wrapper
        byte ==>            Byte
        short==>            Short
        **int==>            Integer
        long==>             Long
        float==>            Float
        double==>           Double
        boolean==>          Boolean
        **char ==>          Character
         */
       byte primitiveByte = 12; // primitiveByte yazip nokta koyarsaniz method cikmaz. cunku primitive ler method icermez
       Byte wrapperByte = 12; // wrapperByte yazip nokta koyarsaniz methodlar cikar cunku wrapper lar method icerir.
        // example : 1 byte data type inin en kucuk ve en buyuk degerlerini ekrana yazdirirniz.
        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Long.MIN_VALUE); //-9223372036854775808
        System.out.println(Long.MAX_VALUE); //9223372036854775807

        // primitive ler nasil wrapper lara cevrilir." autoboxing"
        float f1 = 13.99F;
        Float wrapperF1 = f1;
        // wrapper ler nasil primitive lere cevrilir." unboxing "
        Character w1 = 's';
        char primitiveW1 = w1;

        // note: autoboxing ve unboxing java tarafindan otomatik olarak yapilir.

    }
}
