package s06_interview;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        // kullanicidan bir isim ve karakter girmesini isteyin
        // sonra karakterin kac kez tekrarladigini kontrol edin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz : ");
        String isim=scan.nextLine();

        System.out.print("Lutfen bir karakter giriniz : ");
        char karakter=scan.next().charAt(0);    // tek karakteri alir

        int sayac=0;

        for (int i = 0; i <isim.length() ; i++) {
            if(isim.charAt(i)==karakter){
                sayac++;
            }

        }
        System.out.println("verilen isimde verilen karakter "+sayac+" adet kullanilmistir.");
    }
}
