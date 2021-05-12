package sevenTwo;

public class Wassertier extends Tier implements Tauchfähig{
    public Wassertier(String name){
        super(name);
    }

    @Override
    public void tauchen() {
        System.out.println("Ich kann tauchen!");
    }

    @Override
    public void steckbrief() {
        System.out.println("Name des Tiers: " + this.name);
        this.tauchen();
    }
}
