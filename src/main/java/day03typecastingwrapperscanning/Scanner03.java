package day03typecastingwrapperscanning;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {
      // example kullanicidan bir dikdortgenin en ve boyunu kullanip cevresini ve alani hesaplayan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("kisa kenar");
        int en = input.nextInt();
        System.out.println("uzun kenar");
        int boy = input.nextInt();
        System.out.println("cevre = " +2*(en+boy));
        System.out.println("alan = " + en*boy);
    }


}
