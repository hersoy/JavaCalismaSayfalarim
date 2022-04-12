package s06_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03 {
    public static void main(String[] args) {

        // Part1:
        // Create an arraylist of Strings
        // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
        // print out all the elements, each element on new line

        // Part2:
        // Create a method that accepts a String arraylist and a String as parameters
        // method should add the element at the first index of arraylist

        // Part3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]

        List<String>list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Black");

        for (int i = 0; i <list.size() ; i++) {

            System.out.println(list.get(i));    // get() liste elemanlarini getirir.
        }

        // 2. BOLUM:

        ilkIndexeYazdir(list,"White");

    }

    private static void ilkIndexeYazdir(List<String> list, String white) {
        list.add(0,white);
        System.out.println(list);


        // 3. BOLUM:
        sonIndexeEkle(list,"pink");
    }

    private static void sonIndexeEkle(List<String> list, String pink) {
        list.add(list.size()-1, "pink");
        System.out.println(list);
    }
}
