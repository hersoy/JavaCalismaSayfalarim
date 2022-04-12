package s01_forLoop;

public class C01_forLoop {
    public static void main(String[] args) {

        // Soru 11 ) Interview Question
        //Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        int sayi=7;
        int faktoriyel=1;

        for (int i = sayi; i >=1 ; i--) {

        faktoriyel*=i;
        }
        System.out.println(sayi+"! =" +faktoriyel);


           }

}
