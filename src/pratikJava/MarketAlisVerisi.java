package pratikJava;

import java.util.Scanner;

public class MarketAlisVerisi {
    public static void main(String[] args) {

        // kullanicinin almıs oldugu urun miktari uzerinden indirim yaparak
        // odemesi gereken toplam tutari soyleyiniz

        // eger aldigi urunden

        //1-10 arasi aldiysa %10 indirim
        //10-50 arasi aldiysa %20 indirim
        //50 ustu aldiysa %25 indirim yapalim

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen urun fiyatini giriniz : ");
        double urunFiyati = scan.nextInt();

        System.out.print("Lutfen urun miktarini giriniz : ");
        int urunMiktari = scan.nextInt();


        if (urunMiktari <= 10) {
            System.out.println("%10 indirim kazandiniz, borcunuz = "+urunFiyati*urunMiktari*0.90 +" TL");
        }
        if (urunMiktari > 10 && urunMiktari <= 50) {
            System.out.println("%20 indirim kazandiniz, borcunuz = "+urunFiyati*urunMiktari*0.80+" TL");
        }
        if (urunMiktari > 50) {
            System.out.println("%25 indirim kazandiniz. borcunuz = "+urunFiyati*urunMiktari*0.75+" TL");
        }
    }
}
