package Figura;

public class Pryamoygolnik extends Figura {
    private double lenght;
    private double shirina;

    public Pryamoygolnik(double lenght, double shirina) {
        this.lenght = lenght;
        this.shirina = shirina;
    }

    @Override
    public double calclulatePloshad() {
        return lenght * shirina;
    }

    @Override
    public double calculatePirimetr() {
        return 2*(lenght + shirina);
    }
}
