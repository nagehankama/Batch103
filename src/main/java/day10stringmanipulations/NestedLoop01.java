package day10stringmanipulations;

public class NestedLoop01 {
    public static void main(String[] args) {
        /*
        example ciktiyi verecek kodu yaziniz
        week:1
            day:1
            day:2
            day:3
         week:2
            day:1
            day:2
            day:3
        week:2
            day:1
            day:2
            day:3
            ...
         */
        for(int i=1;i<5;i++){
            System.out.println("week: "+i);
            for (int k=1;k<8;k++){
                System.out.println("day: "+k);
            }
        }

    }
}
