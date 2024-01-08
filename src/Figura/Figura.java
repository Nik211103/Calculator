package Figura;

public class Figura {
    public static void main(String[] args) {
        Pryamoygolnik pryamoygolnik = new Pryamoygolnik(2.0,3.0);
        System.out.println(pryamoygolnik.calclulatePloshad());
        Crug cruzok = new Crug(2.1);
        System.out.println(cruzok.calculatePirimetr());
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
