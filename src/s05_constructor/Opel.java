package s05_constructor;

public class Opel {

    String marka;
    String model;
    int yil;
    String yakit;
    int no;

    public Opel(String marka, String model, int yil, String yakit) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.yakit = yakit;
    }

    public Opel(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }


    public String toString() {
        return ("marka :" + marka + " model :" + model +
                " yil :" + 2005 + " yakit :" + yakit);


    }
}


