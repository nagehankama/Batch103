package day12loops;

public class NestedForLoop01 {
    public static void main(String[] args) {

        // asagidaki sekli ekrana yazdiran kodu yaziniz
        // ****
        // ****
        // ****

        for(int i =1;i<4;i++){
            for(int k=1;k<5;k++){
                System.out.print("*");
            }
            System.out.println();
        }


        /*Example 2 asagidaki kodu cizen kodu yaziniz
        1
        12
        123
        1234
        12345
         */
        for(int i=1; i<6;i++){
            for(int k=1; k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
