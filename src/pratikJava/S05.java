package pratikJava;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {

        // kullanicinin girmis oldugu e-mail adresinin gecerli bir gmail adresi olup olmadigini
        // dogrulayan bir program yaziniz

        // kural 1- @ isareti icermesi gerekir
        // kural 2- @ isaretinden sonra "gmail.com" ifadesinin gecmesi lazim

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen e-mail adresinizi giriniz : ");
        String eMail=scan.nextLine();

        int girilenMail=eMail.indexOf("@");
        String gmail=eMail.substring(girilenMail+1);

        if (!eMail.contains("@")){
            System.out.println("lutfen @ isareti iceren bir mail adresi giriniz");

        }
        if (!eMail.contains("gmail.com")){
            System.out.println("Lutfen dogru bir gmail adresi giriniz");
        }
        else{
            System.out.println("tebrikler dogru bir gmail adresini girdiniz");
        }


    }
}
