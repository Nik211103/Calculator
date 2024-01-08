package Figura;

public class Treygolnik extends Figura {
    private double storona1;
    private double storona2;
    private double storona3;

    public Treygolnik(double storona1, double storona2, double storona3) {
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }

    @Override
    public double calculatePirimetr() {
        return storona1 + storona2 + storona3;
    }

    @Override
    public double calclulatePloshad() {
        double s = (storona1 + storona2 + storona3) / 2;
        return Math.sqrt(s * (s - storona1) * (s - storona2) * (s - storona3));
    }
}
