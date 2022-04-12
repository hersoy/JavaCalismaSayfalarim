package s01_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
                sekli olusturalim...
         */

        int sayi = 4;
        for (int i = 1; i <= sayi; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 1; i <= sayi-1; i++) {
            for (int j = 1; j <=sayi-i; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
