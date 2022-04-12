package pratikJava;

import java.util.Scanner;

public class S03_IfElse {
    public static void main(String[] args) {
        // kullanicinin yazmis oldugu TC kimlik numarasinin uygun formatta olup olmadigini dogrulayan bir program yaziniz.
        // kural 1- limlik no 0 ile baslamaz
        // kural 2- 11 hane olamlidir
        // kural 3- son rakami cift olmalidir

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen Kimlik Numaranizi Giriniz : ");
        long kimlikNo = scan.nextLong();

        long ilkHane = kimlikNo / 1000000000;   // tc kimlik no yu 10 haneli bir rakama bolerek ilk hanesini elde ettik
        String stringKimlikNo = "" + kimlikNo;
        long onBirHaneKimlikNo = stringKimlikNo.length();
        System.out.println(onBirHaneKimlikNo);
        int sonrakam = (int) (kimlikNo % 2);


        if (ilkHane == 0) {
            System.out.println("kimlik no 0 ile baslayamaz");
        }
        if (onBirHaneKimlikNo != 11) {
            System.out.println("tc no 11 haneden olusmalidir");
        }
        if (sonrakam % 2 != 0) {
            System.out.println("son rakam cift sayi olmalidir");

        } else {
            System.out.println("terikler dogru bir kimlik numarasi girdiniz");
        }
    }
}