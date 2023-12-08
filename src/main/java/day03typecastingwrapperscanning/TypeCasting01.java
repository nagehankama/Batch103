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
        //           floati byte yapan kodu yaziniz.

        short populationOfVillage = 30000;
        double newPopulationOfVillage = populationOfVillage;
        float price = 13.999F;
        short newPrice = (short)price;


    }
}
