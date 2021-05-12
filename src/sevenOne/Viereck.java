package sevenOne;

import sixOne.Punkt;

public class Viereck extends GrundForm{
    private Punkt a;
    private Punkt b;
    private Punkt c;
    private Punkt d;

    public Viereck(String bezeichner){
        this.bezeichnung = bezeichner;
        Punkt ursprung = new Punkt(0, 0);
        this.setPunkte(ursprung, ursprung, ursprung, ursprung);
    }

    public void setPunkte(Punkt a, Punkt b, Punkt c, Punkt d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public void ausgabe() {
        System.out.println("Das Viereck hat die Bezeichnung: " + this.bezeichnung);
        System.out.println("Die Punkte lauten: ");
        a.printPoint();
        b.printPoint();
        c.printPoint();
        d.printPoint();
        System.out.println();
    }
}
