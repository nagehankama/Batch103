package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
      /*
      example kullanicidan gun sayisini aliniz ve gun ismi yazdiriniz
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasi giriniz..");
        byte gunNo = input.nextByte();
        //1.yol if ile
        if (gunNo == 1) {
            System.out.println("Pazar");
        } else if (gunNo == 2) {
            System.out.println("Pazartesi");
        } else if (gunNo == 3) {
            System.out.println("Sali");
        } else if (gunNo == 4) {
            System.out.println("Carsamba");
        } else if (gunNo == 5) {
            System.out.println("Persembe");
        } else if (gunNo == 6) {
            System.out.println("Cuma");
        }else if (gunNo == 7) {
            System.out.println("Cumartesi");
        }else{
            System.out.println("gecerli sayi giriniz");
        }
        // 2.yol switch ile cozunuz
        switch (gunNo){
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("sali");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("persembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("gecerli gun sayisi giriniz");
        }
    }
}
