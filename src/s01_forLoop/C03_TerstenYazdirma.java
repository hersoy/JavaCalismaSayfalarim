package s01_forLoop;

public class C03_TerstenYazdirma {
    public static void main(String[] args) {

        // verilen cunleyi tersten yazdirin

        String str="Bu java beni cok zorlıyor";

        for (int i =str.length()-1; i >=0 ; i--) {

            System.out.print(str.substring(i,i+1));
        }


        // Ekrana 10 kez “Java guzeldir” yazdirin



        for (int i = 1; i <=10 ; i++) {

            System.out.println(i+ "-Java Guzeldir");

        }
    }
}
