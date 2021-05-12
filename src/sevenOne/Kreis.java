package sevenOne;

import sixOne.Punkt;

public class Kreis extends GrundForm{
    private Punkt mittelpunkt;
    private double radius;

    public Kreis(String bezeichner){
        this.bezeichnung = bezeichner;
        this.mittelpunkt = new Punkt(0, 0);
        this.radius = 0;
    }

    public void setPunktRadius(Punkt p, double r){
        this.mittelpunkt = p;
        this.radius = r;
    }

    @Override
    public void ausgabe() {
        System.out.println("Der Kreis hat die Bezeichnung: " + this.bezeichnung);
        System.out.println("Der Punkt lautet: ");
        mittelpunkt.printPoint();
        System.out.println("Der Radius lautet: " + this.radius + "\n");
    }
}
