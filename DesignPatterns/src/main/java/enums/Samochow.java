package enums;

public class Samochow {
    private String marka;
    private String model;
    private String kolor;

    public Samochow() {

    }

    public Samochow(String marka, String model, String kolor) {

        this.marka = marka;
        this.model = model;
        this.kolor = kolor;

    }

    public String getMarka() {
        return marka;
    }


    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}


