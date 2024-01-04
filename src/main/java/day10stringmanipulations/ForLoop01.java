package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {
        // example ekrana 5000 kere Hi! yazdiriniz
        // tekrarli isler icin loop kullaniriz.
        // dort cesit loop cesidi vardir
        /*
        1-for-loop
        2-while-loop
        3-do-while-loop
        4-for-each-loop
         */
       /* for-loop
       example 2 ekrana 5 kere "Hi" yazdiriniz
        */
        //  baslangic deger  loop hangi sart altinda calisacak  increment(artirma)veya decrement(azaltma)
        for (int i = 1; i < 6; i = i + 1) {
            System.out.println("Hi");
        }

        //example 3: 4 den 7 ye kdr tam sayilari ekrana yazdiran kodu yaziniz
        for (int i = 4; i < 8; i = i + 1) {
            System.out.println(i + " ");
        }
        System.out.println();
        //example 3 14 den 5 e kadar tam sayilari yazdiriniz
        for (int i = 14; i > 4; i--) {
            System.out.println(i);
        }
        // example 5 14 den 5 e kdr tum cift am sayilari yazdiriniz
        //1.yol
        for (int i = 14; i > 4; i = i - 2) {
            System.out.print(i + " ");
        }
        //2.yol
        for (int i = 14; i > 4; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        // example "Java" stringini "J*a*v*a*" stringine cevirin
        String str = "Java is love";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }
        System.out.println();
        // example size verilen string e=de tekrarsiz karakterleri ekrana yazdiriniz
        // hellooo ali
        String s = "hellooo ali";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print(c);

            }

        }
    }
}
