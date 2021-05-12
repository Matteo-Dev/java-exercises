package sevenTwo;

public class Landtier extends Tier implements Lauffähig{
    public Landtier(String name){
        super(name);
    }

    @Override
    public void laufen() {
        System.out.println("Ich kann laufen!");
    }

    @Override
    public void steckbrief() {
        System.out.println("Name des Tiers: " + this.name);
        this.laufen();
    }
}
