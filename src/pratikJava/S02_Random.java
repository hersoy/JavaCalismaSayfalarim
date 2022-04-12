package pratikJava;

import java.util.Random;

public class S02_Random {
    public static void main(String[] args) {

        Random rastgele = new Random();
        int sayi = rastgele.nextInt(101);

        System.out.println(sayi);

        if (sayi < 25) {
            System.out.println("sayi 0-25 araligindadir");
        }
        if (sayi < 50 && sayi >= 25) {
            System.out.println("sayi 25-50 araligindadir");
        }
        if (sayi < 101 && sayi >= 50) {
            System.out.println("sayi 50-100 araligindadir");

        }

    }
}