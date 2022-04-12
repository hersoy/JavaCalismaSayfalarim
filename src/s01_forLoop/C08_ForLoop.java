package s01_forLoop;

public class C08_ForLoop {

    public static void main(String[] args) {

        String str="CODER";

        /*
    C
    O O
    D D D
    E E E E
    R R R R R

 */
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <=i ; j++) {

                System.out.print(str.charAt(i)+" ");

            }
            System.out.println();   // bu printle her satir bittikten sonra bir alt satira gecmesini saglar.

        }

    }
}
