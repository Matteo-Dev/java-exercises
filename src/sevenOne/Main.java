package sevenOne;

import sixOne.Punkt;

public class Main {
    public static void main(String[] args){
        Viereck v = new Viereck("Viereck 1");
        Kreis k = new Kreis("Kreis 1");

        Punkt p1 = new Punkt(1, 3);
        Punkt p2 = new Punkt(4, 3);
        Punkt p3 = new Punkt(5, 8);
        Punkt p4 = new Punkt(1, 8);
        double radius = 2.5;

        v.setPunkte(p1, p2, p3, p4);
        k.setPunktRadius(p1, radius);

        v.ausgabe();

        k.ausgabe();
    }
}
