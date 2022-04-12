package s04_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        // Soru 1: Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini
        // For each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        int arr[]={2,1,5,3,7,9,4};

        int sayilarinCarpimi=1;

        for (int each:arr
             ) {
            sayilarinCarpimi*=each;


        }
        System.out.println("sayilarin carpimi : "+ sayilarinCarpimi );
    }
}
