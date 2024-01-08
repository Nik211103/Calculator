package Figura;

import java.util.ArrayList;


public class Figura {
    public static void main(String[] args) {

        ArrayList<Figura> figury = new ArrayList<>();
        figury.add(new Crug(2.0));
        figury.add(new Pryamoygolnik(12,4));
        figury.add(new Treygolnik(1,2,3));
        figury.add(new Cvadrat(5));
        for (Figura figura: figury) {
            System.out.println("Area: " + figura.calclulatePloshad());
            System.out.println("Perimeter: " + figura.calculatePirimetr());
            System.out.println("-------------");
        }

    }

    public Figura(){

    }

    public double calclulatePloshad(){
        return 0;
    }

    public double calculatePirimetr(){
        return 0;
    }


}
