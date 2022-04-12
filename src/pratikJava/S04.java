package pratikJava;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {

        // kullanicidan girmis oldugu "kullanici adi" ve "sifre" bilgilerini komtrol ederek
        // giris yapip yapamayacagini soyleyen bir program yaziniz

        // admin - 123456

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen kullanici adinizi giriniz : ");
        String kullaniciAdi=scan.next();

        System.out.print("Lutfen sirenizi giriniz : ");
        int sifre=scan.nextInt();

        if (kullaniciAdi.equals("admin") && sifre==123456){
            System.out.println("Hosgeldiniz...");

        }
        if (!kullaniciAdi.equals("admin")){
            System.out.println("Lutfen kullanici adini dogru giriniz");
        }
        if (sifre!=123456){
            System.out.println("Lutfen sifrenizi dogru giriniz");
        }




    }
}
