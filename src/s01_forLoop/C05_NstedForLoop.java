package s01_forLoop;

public class C05_NstedForLoop {
    public static void main(String[] args) {

        /*
        Soru 12- Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        *
        * *
        * * *
        * * * *

        */
        int sayi=4;
        for (int i = 1; i <= sayi; i++) {

            // for (int j = 1; j <=sayi ; j++) {    bu sekilde yazdirirsak 4*4 kare yapmıs oluruz.
                                                    // ikinci forLoop taki sayi yi "i" yaparsak ucgen olur

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
