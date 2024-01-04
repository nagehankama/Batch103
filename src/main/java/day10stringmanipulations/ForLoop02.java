package day10stringmanipulations;

public class ForLoop02 {
    public static void main(String[] args) {
        // bir stringteki "m" krakteri haric tum karakterleri yazdir.
        //Andromeda == >
        String str ="Andromeda";
        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(c!='m'){
                System.out.print(c);
            }
        }
        // 2.yol
        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(c=='m'){
                continue; // bosver . loop un icinde bazi degerler icin loopun calismamasini isterseniz continue kullaniniz
            }
            System.out.print(c);
        }
        //example  1 den 100 e kadar 6 ile bolunenler haric tum tamsayilari yaziniz
        for(int i=1;i<101;i++){
            if(i%6==0){
                continue;
            }
            System.out.print(i+" ");
        }

        // example size verilen bir stringteki m den onceki karakterleri yazdiriniz
        String s="Luxemburg";
        for(int i=0;i>s.length();i++){
            char c=s.charAt(i);
            if(c=='m'){
                break;
            }
            System.out.print(c);
        }


    }
}
