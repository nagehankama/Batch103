package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        passwordun ilk harfi buyuk harf ise
        'A' olursa gecerli password aksi halde gecersiz password
        passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli password aksi halde gecersiz password
         */
        String pwd = "Axy12!";
        char ilkHarf=pwd.charAt(0);
        if (ilkHarf >= 'A' && ilkHarf <= 'Z'){
            if (ilkHarf == 'A') {
                System.out.println("GECERLI PASSWORD");
            } else {
                System.out.println("GECERSIZ PASSWORD");
            }
        }else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("GECERLI PASSWORD");
            } else {
                System.out.println("GECERSIZ PASSWORD");
            }
        }else{
            System.out.println("ilk karakter harf olmalidir");
        }
    }
}
