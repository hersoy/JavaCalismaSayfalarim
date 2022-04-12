package s03_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class C01_ArrayList {
    public static void main(String[] args) {

        List<String> list1=new ArrayList<>();

        list1.add("Kartal");
        list1.add("Sinek");
        list1.add(1,"Aslan");
        System.out.println(list1);      // [Kartal, Aslan, Sinek]


        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1, 3);
        System.out.println(sayilar);        // [5, 3, 7]

        System.out.println(sayilar.size()); // 3 (3 elamanının oldugunu bize verir)

        System.out.println(sayilar.isEmpty());  // false (bos mu? sorusuna dolu oldugu icin false dondurur)












    }
}
