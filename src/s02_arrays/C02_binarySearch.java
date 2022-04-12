package s02_arrays;

import java.util.Arrays;

public class C02_binarySearch {
    public static void main(String[] args) {


        // istenen bir sayinin verilen bir array'de olup olmadigini bulun

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

       int istenenSayi=9;

        // once sort yapmaliyiz

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));       // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]

        // sonra istene sayinin olup olamdigini true/false olarak bulalim

        System.out.println(Arrays.binarySearch(arr, istenenSayi));


    }
}
