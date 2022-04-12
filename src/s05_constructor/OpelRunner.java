package s05_constructor;

public class OpelRunner {
    public static void main(String[] args) {


        Opel arb1=new Opel("opel", "meriva", 2005, "benzinli");

        System.out.println(arb1);

        Opel arb2=new Opel("Opel", "meriva", 2005);
        System.out.println(arb2);


    }
}
