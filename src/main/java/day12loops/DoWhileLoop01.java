package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        // while loop icin loop un body si icindeki kodun hic calistirilmama ihtimali vardir
        // zero executaion mumkundur
        int i=1;
        while(i<1){
            System.out.println("WhileLoop");
            i++;
        }
        // do-while loop un bodysi icindeki kod her halukarda en az bir kere calisir
        // zero executaion mumkun degildir
        int k=1;
        do{
            System.out.println("do-while loop");
            k++;
        }while(k<1);
        // example bir ondalik sayinin ondalik kismindaki rakammlarin toplamini bulunuz
        //24.5673 ==23
        double num=24.5673;
        String str=String.valueOf(num);
        System.out.println(str);
        // String.valueOf() methodu parantezin icine konulan data nin tipine string yapar
        // regex icin nokta kullandiginizda onune\\ koyunuz
        String decimalPart=str.split("\\.")[1];
        System.out.println(decimalPart);
        int newNum=Integer.valueOf(decimalPart);
        System.out.println(newNum);
        int sum=0;
        do{
            sum=sum+newNum%10;
            newNum=newNum/10;
        }while(newNum>0);
        System.out.println(sum);



    }
}
