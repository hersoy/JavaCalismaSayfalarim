package s01_forLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        // kullanicidan bir rakam alip carpim tablosu olusturalim

        int sayi=3;

        for (int i = 1; i<=sayi ; i++) {

            for (int j = 1; j <=sayi ; j++) {

                System.out.print((i*j)+" ");

            }
            System.out.println("");

        }
    }
}
