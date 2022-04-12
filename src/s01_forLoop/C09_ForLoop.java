package s01_forLoop;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {

        // Bir metindeki unique karakterleri bulan bir kod yaziniz.
        // Hello ==> Heo

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir metin giriniz :");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) { // burada birisi sondan birisi bastan
                                                                                // baslayarak metni tararlar
                                                                                // farklı indekslerde ayni kelime bulunursa
                                                                                // tekrarlana kelime bulunmus olur.

                System.out.print(str.charAt(i));


            }
        }
    }
}
