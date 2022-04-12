package s03_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();

        isimler.add("Furkan");
        isimler.add("İbrahim");
        isimler.add("Nursima");
        isimler.add("Enes");
        System.out.println(isimler);


        isimler.remove("Enes");
        System.out.println(isimler);

        // istersek index'e gore de remove yapabiliriz.

        isimler.remove(1);
        System.out.println(isimler);   // (burada 1. index te bulunan ibrahim silinir.)

        System.out.println(isimler.remove(1));      // Burada ise 1. index teki nursima yi siler ve bize
                                                         // Nursima ismini konsolda yazdirir






    }
}
