package s04_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        // Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini
        // Foreachloop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        List<Integer> list1=new ArrayList<>(Arrays.asList(2,3,5,7,8,9,12));
        int sayilarinKaresi=1;

        System.out.println(list1);

        for (int each:list1
             ) {
            sayilarinKaresi=each*each;
        }

        System.out.println("listteki sayilarin kareleri : "+ sayilarinKaresi);


    }
}
