package s06_interview;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        // Kullanicidan toplamak üzere sayilar isteyin
        // sayi adedi 10'u gecince veya toplam 500'u gecerse
        // bu kadar yeter
        //  ... adet sayi giridin, toplami .... yazdirin.

        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        Scanner scan = new Scanner(System.in);

        while (sayac < 10 && toplam < 500) {
            System.out.print("lutfen toplamak istediginiz sayilari giriniz : ");
            sayi = scan.nextInt();
            sayac++;
            toplam += sayi;

        }
        System.out.println("bu kadar sayi yeter " + sayac + " adet sayi girdiniz. toplami : " + toplam);
    }
}
