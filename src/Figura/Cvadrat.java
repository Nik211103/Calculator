package Figura;

public class Cvadrat extends Figura {
    private double lenght;

    public Cvadrat(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double calclulatePloshad() {
        return lenght * lenght;
    }

    @Override
    public double calculatePirimetr() {
        return lenght + lenght + lenght + lenght;
    }
}
