package pratikJava;

import java.util.Scanner;

public class S01_IfElse {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir gunde kac bardak cay iciyorsun : ");
        double bardak=scan.nextDouble();

        System.out.print("bir bardak caya kac seker atiyorsun : ");
        double seker=scan.nextDouble();

        double gun=bardak*seker;
        double yil=bardak*seker*3*365/100;
        double omur=bardak*seker*3*365*60/1000;

        if(seker==0){
            System.out.println("tebrikler saglikli yasiyorsunuz");
        }else {

            System.out.println("Bir yilda " + yil + " kg seker kullaniyorsun");
            System.out.print("60 yillik omrunda " + omur + " kg seker kullaniyorsun");


        }

    }
}

