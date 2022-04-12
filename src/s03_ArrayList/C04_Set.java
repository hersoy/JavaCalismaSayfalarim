package s03_ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();

        isimler.add("Furkan");
        isimler.add("İbrahim");
        isimler.add("Nursima");
        isimler.add("Enes");
        System.out.println(isimler);    // [Furkan, İbrahim, Nursima, Enes]

        isimler.set(0,"Talha");
        System.out.println(isimler);    //

        System.out.println(isimler.get(3));     // enes (burada 3. index'teki elementi bize getiriyor)
        System.out.println(isimler.get(0));     // Talha



    }
}
