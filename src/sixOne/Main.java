package sixOne;

public class Main {
    public static void main(String[] args){
        Punkt a = new Punkt(10, 20);
        Punkt b = new Punkt(a);
        Punkt c = new Punkt();

        c.setX(30);
        c.setY(40);

        b.printPoint(true);
        System.out.println("Abstand von Punkt b zu <0|0>: " +b.abstand());
    }
}
