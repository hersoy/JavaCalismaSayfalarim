package s03_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);
        sayilar.add (2,8);


        sayilar.remove(2);
        System.out.println(sayilar);    // 2. index'e 8 elementini atamistik. burada ise 2. index'teki sayiyi
                                        // kaldirdigimizda yine 8 sayisini kaldirmis olduk

    }
}
