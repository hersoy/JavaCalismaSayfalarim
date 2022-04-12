package s02_arrays;

import java.util.Arrays;

public class C01_sort {

    public static void main(String[] args) {

    // verilen bir arrayi buyukten kucuge siralayip bize donduren method olusturun

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]


        int tersArr[] = new int[arr.length];    // ici bos bir array olusturduk

        for (int i = 0; i < arr.length; i++) {

            tersArr[i]= arr[arr.length-1-i];

            }
        System.out.println(Arrays.toString(tersArr));   // [45, 25, 9, 9, 6, 5, 4, 3, 1, 0]
        }
    }

