package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    /*
    1-ayni data tipinde coklu datayi depolamak icin java nin olusturdugu yapilar vardir
     bu yapilardan birisi de array dir
     */
    public static void main(String[] args) {
        // Array nasil olusturulur?
        int stdAges[]= new int[7];
        // array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));
        // arraylere elemanlar nasil eklenir
        stdAges[0]=12;
        stdAges[1]=11;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));
        //array deki herhangi bir elemani nasil yazdirabiliriz.
        System.out.println(stdAges[4]);
        // example array deki en kucuk ve en buyuk elemani yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk=stdAges[0];
        // note lenght() stringlerde kullanilir. lenght arraylerde kullanilir
        int son=stdAges[stdAges.length-1];
        System.out.println(ilk+son);

        // example stdAges arrayindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz
        int sum =0;
        for(int i=0;i<stdAges.length;i++){
            sum= sum+stdAges[i];

        }
        System.out.println(sum);
        // for each loop arrays ve collections larda kullanilir.
        int t=0;
        for(int w:stdAges){
            t=t+w;
        }
        System.out.println(t);

        // example string bir array olusturunuz
        //bu array e bes adet isim yerlestriniz
        //bu isimlerdeki karaktersayilarinin toplamini ekrana yazdiriniz
        String stdNames[]=new String[5];
        stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="Veli";
        stdNames[3]="Kemal";
        stdNames[4]="Cem";
        int karakterSayilariToplami=0;
        for(String w :stdNames){
           karakterSayilariToplami= karakterSayilariToplami+ w.length();
        }
        System.out.println(karakterSayilariToplami);
        // example Char bir array olusturunuz
        // bu array e bes elaman olusturunuz
        // bu array deki sadece buyuk harfleri ekrana yazdiriniz
        char ch[]={'A', 'c', 'D','k','M'};
        for(char w:ch){
            if(w>='A'&&w<='Z'){
                System.out.println(w);
            }
        }
    }
}
