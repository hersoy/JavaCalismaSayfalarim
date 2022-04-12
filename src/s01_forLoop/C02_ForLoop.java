package s01_forLoop;

public class C02_ForLoop<sayi1, sayi2> {
    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        // sonucu yazdiran bir program yaziniz

        int sayi1 = 4;
        int sayi2 = 8;
        int temp = 0;

        if (sayi1 > sayi2) {



        for (int i = sayi1; i >= sayi2; i--) {
            temp += i;

        }
        System.out.println("sayilarinToplami :" + temp);

        }else if(sayi2>sayi1){
            for (int i = sayi2; i>=sayi1 ; i--) {
                temp+=i;

            }
            System.out.println("sayilarinToplami :" + temp);

    }

        }



    }
