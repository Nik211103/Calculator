package Figura;

public class Crug extends Figura {
    private double radius;

    public Crug(double radius) {
        this.radius = radius;
    }

    @Override
    public double calclulatePloshad() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePirimetr() {
        return 2 * Math.PI*radius;
    }
}
