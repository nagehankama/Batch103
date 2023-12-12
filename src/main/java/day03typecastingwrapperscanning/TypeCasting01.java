package day03typecastingwrapperscanning;

public class TypeCasting01 {
    // Type Casting: bir numeric data type i diger numeric data type a cevirmektir.
    //              byte<short<int<long<float<double
    // note 1: kucuk data type dan buyuk data type a cevirmek "auto widening",
    //  note :2 buyuk data tipini kucuk data tipine cevirmeye "explicit narrowing" denir.

    public static void main(String[] args) {
        byte age = 23;
        int newAge = age;
        long population = 1234;
        int newPopulation = (int)population;
        // example:1 shortu double ceviren kodu yaziniz.
        short populationOfVillage = 300;
        double newPopulationOfVillage = populationOfVillage;

        //  example: 2 floati byte yapan kodu yaziniz.
        float price = 13.999F; //"auto widening"
        byte newPrice = (byte)price; //"explicit narrowing"
        System.out.println(newPrice);  // 13 ==> java ondalik sayiyi tam sayiya cevirirken yuvarlama yapmaz.
                                       // ondalik kismi siler
        int number= 515;
        byte newNumber= (byte)number;
        System.out.println(newNumber);//3 ==> java 515 i 256(byte taki sayilarin sayisi) ya boldu kalani return etti

        int num =510;
        byte newNum = (byte)num;
        System.out.println(newNum); //-2


    }
}
