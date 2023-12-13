package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
       // 1. yol
        Scanner input=new Scanner(System.in);
        System.out.println("Please write your first name");
        String firstName= input.next();
        System.out.println("Please write your middle name");
        String middleName= input.next();
        System.out.println("Please write your last name");
        String lastName= input.next();
        System.out.println("Please write your ID");
        String id= input.next();
        System.out.println( firstName+" "+middleName+" "+lastName);
        System.out.println(id);
        // 2.yol
        System.out.println("Please write your first, middle,last name and ID");
        String first= input.next();
        String middle= input.next();
        String last= input.next();
        String idNo= input.next();
        System.out.println( first+" "+middle+" "+last);
        System.out.println(idNo);
        /*
        next() ile nextLine() farki nedir
        next() methodu kullanicidan gelen Stringin ilk kelimesini alir
        nextLine() methodu kullanicidan gelen Stringin tamamini alir.
         */
        // 3.yol
        System.out.println("Please write your first, middle,last name and ID");
        String tamIsim= input.nextLine();
        System.out.println(tamIsim);

    }

}
